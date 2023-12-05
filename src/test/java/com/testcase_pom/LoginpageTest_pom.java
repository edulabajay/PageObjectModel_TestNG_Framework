package com.testcase_pom;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Basepage_pom;
import com.qa.pages_pom.Homepage_pom;
import com.qa.pages_pom.LoginPage_pom;
import com.utils_pom.UtilsTest;

public class LoginpageTest_pom extends Basepage_pom {

	//Creating Object reference variable
	LoginPage_pom loginpage;
	Homepage_pom homepage;
	UtilsTest utilspage;





	public LoginpageTest_pom() {

		//Invoke superclass constructor from basepage_pom
		super();
	}
	
	/*Test cases should be independent with each other
	 *Before each test case-- Launch the browser and login
	 *After each test case-- close the browser
	 * 
	 * 
	 */

	@BeforeMethod
	public void steup() {

		initialize();
		loginpage = new LoginPage_pom();
		utilspage = new UtilsTest();
	}

	@Test(priority=1)
	public void validate_loginpage_titletest() {
		String title=loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");

	}
	@Test(priority=2)
	public void validate_loginpage() {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}


	@AfterMethod
	public void tear() {
		driver.quit();
	}

}
