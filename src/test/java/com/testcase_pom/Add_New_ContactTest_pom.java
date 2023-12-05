package com.testcase_pom;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.Basepage_pom;
import com.qa.pages_pom.Create_New_Contact;
import com.qa.pages_pom.Homepage_pom;
import com.qa.pages_pom.LoginPage_pom;
import com.utils_pom.UtilsTest;

public class Add_New_ContactTest_pom extends Basepage_pom {
	LoginPage_pom loginpage;
	Homepage_pom homepage;
	Create_New_Contact contact;
	UtilsTest utilspage;

	String sheetName = "MySheet"; //ExcelSheetName

	public Add_New_ContactTest_pom() {

		//Invoke superclass constructor from basepage_pom
		super();
	}

	@BeforeMethod
	public void steup() {

		initialize();
		loginpage = new LoginPage_pom();
		utilspage = new UtilsTest();
		contact = new Create_New_Contact();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contact=homepage.validate_Create_New_contact_btn();

	}

	@DataProvider
	public Object[][] getCRMTestData() throws InvalidFormatException    {
		Object data[][]= UtilsTest.getTestData(sheetName);	

		return data;
	}

	@Test(priority=1, dataProvider="getCRMTestData")
	public void validate_new_contact(String first_name, String last_name,String Middle_name,String company_name ) {
		homepage.validate_Create_New_contact_btn();
		//  contact.add_contact_details("hena","madan","peek","eduuuu"); // Assuming "Terminated" is the status you want to select

		contact.add_contact_details(first_name, last_name, Middle_name, company_name);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


	/*//WITHOUT DATA DRIVEN TESTING

	public void validate_new_contact() {
	    homepage.validate_contact_btn();
	    contact.add_contact_details(); // Assuming "Terminated" is the status you want to select
	}
	 */

	//CacheLookup in selenium is it created small memory for WebElement so we can it by WebElement name
}
