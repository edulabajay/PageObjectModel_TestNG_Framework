package com.testcase_pom;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.Basepage_pom;
import com.qa.pages_pom.Student_dashboard;
import com.qa.pages_pom.LoginPage_pom;
import com.utils_pom.UtilsTest;

public class LoginpageTest_pom extends Basepage_pom {

	//Creating Object reference variable

	Student_dashboard dashboard;
	UtilsTest utilspage;
	LoginPage_pom loginpage;



	public LoginpageTest_pom() {

		//Invoke superclass constructor from basepage_pom
		super();
		
		/***Test cases should be independent with each other
		 *Before each test case-- Launch the browser and login
		 *After each test case-- close the browser */	
	}
	
	@BeforeMethod
	public void SetUP() {

		initialize();
		loginpage = new LoginPage_pom();
		utilspage = new UtilsTest();
		
	}


	@Test(priority=1)
	public void loginTest() {
		dashboard = loginpage.login(prop.getProperty("user_name"),prop.getProperty("user_pass"));
		
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());

		
		
		//loginpage.enter_email("ajay@edulab.in");
		//loginpage.enter_password("123456");
		//loginpage.login_btn();

		
	}
	
	


	@AfterMethod
	public void tear() {
		driver.quit();
	}

}


/***

//test cases should be separated -- independent with each other
//before each test case -- launch the browser and login
//test -- execute test case
//after each test case -- close the browser


@BeforeMethod
Launch Browser → Login
   ↓
@Test
Execute Test Steps
   ↓
@AfterMethod
Close Browser





*/