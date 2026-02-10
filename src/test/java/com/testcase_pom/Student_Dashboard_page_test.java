package com.testcase_pom;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Basepage_pom;
import com.qa.pages_pom.Student_dashboard;
import com.qa.pages_pom.LoginPage_pom;
import com.qa.pages_pom.Student_application;


public class Student_Dashboard_page_test extends Basepage_pom  {
	LoginPage_pom loginpage;
	Student_dashboard dashboard;
	Student_application application;
	
	

	public Student_Dashboard_page_test() {

		//Invoke superclass constructor from basepage_pom
		super();
	}
	
	@BeforeMethod
	public void steup() {

		initialize();
		loginpage = new LoginPage_pom();
		dashboard = new Student_dashboard();
		application = new Student_application();
		dashboard = loginpage.login(prop.getProperty("user_name"),prop.getProperty("user_pass"));
		          
		   
	}
	
	@Test(priority=1)
	public void click_new_application_button_test() {
		dashboard.validate_student_create_new_application_btn();

		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());


	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
	

