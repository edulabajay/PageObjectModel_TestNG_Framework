package com.testcase_pom;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Basepage_pom;
import com.qa.pages_pom.Create_New_Contact;
import com.qa.pages_pom.Homepage_pom;
import com.qa.pages_pom.LoginPage_pom;
import com.utils_pom.UtilsTest;

public class HomepageTest_pom extends Basepage_pom  {
	LoginPage_pom loginpage;
	Homepage_pom homepage;
	Create_New_Contact contact;
	UtilsTest utilspage;

	public HomepageTest_pom() {

		//Invoke superclass constructor from basepage_pom
		super();
	}
	
	@BeforeMethod
	public void steup() {

		initialize();
		loginpage = new LoginPage_pom();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		utilspage = new UtilsTest();
		contact = new Create_New_Contact();	
	
	}
	
	@Test(priority=1)
	public void Homepage_title() {
	    String homepagetitle = homepage.Verify_homepage_title();
	    Assert.assertEquals(homepagetitle, "Cogmento CRM");
	    System.out.println("Homepage Title: " + homepagetitle);
	}
	
	@Test(priority=2)
	public void verifyContacts_link() {
		
		//*** here homepage object/page returns contact page
		
		contact = homepage.validate_contact_link();
		homepage.validate_Create_New_contact_btn();

	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	
}
