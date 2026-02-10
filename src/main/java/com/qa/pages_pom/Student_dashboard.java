package com.qa.pages_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.Basepage_pom;

public class Student_dashboard extends Basepage_pom {

    public Student_dashboard() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@nbbutton]")
    WebElement new_applictions_btn;

    public Student_application validate_student_create_new_application_btn() {
        new_applictions_btn.click();
        
        return new Student_application();
    }
}

















/*
	public Create_New_Contact validate_Create_New_contact_btn() {
 
//---Here we use Action class for Mouse Movement----//
		
		//Method - 1
		//create_contact_btn.click();
		//return new Create_New_Contact();

		
		//Method - 2
		Actions action = new Actions(driver);
		action.moveToElement(contacts_link).build().perform();
		create_contact_btn.click();
		
		return new Create_New_Contact();

	}
*/

