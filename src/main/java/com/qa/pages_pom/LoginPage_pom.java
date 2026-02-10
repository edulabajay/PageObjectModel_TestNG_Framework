package com.qa.pages_pom;
//Page Object Model =  "Locate all element on WebPage + actions" in page classes(mnje webpage vrti konte konte feature test karycha ahe e.g button,username,password,search,edit) and call them from tests
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Basepage_pom;

public class LoginPage_pom extends Basepage_pom{

	//"driver" here driver is use for initialize browser for all WebElement that we initialize above with @FindBy
	//"this"   here this is for refer/pointing to current class object
	//driver and this for current class reference
	
   //1.Initialize the Page Object
	public LoginPage_pom() {
		PageFactory.initElements(driver, this);	  
	}

	//2.Locate WebElements of login web page using => @FindBy Page Factory or Object Repository
	@FindBy(id = "input-email")
	WebElement email;

	@FindBy(id= "input-password")
	WebElement password;

	@FindBy(xpath = "//button")
	WebElement login_button;


	//3.Action(Method)
	public Student_dashboard login(String useremail, String userpass) {

	    email.sendKeys(useremail);
	    password.sendKeys(userpass);
	    login_button.click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.urlContains("student-dashboard"));

	    // login successful झाल्यावर dashboard page return
	    return new Student_dashboard();
	    
	}

		
	}




/***
 useremail हा method parameter आहे

म्हणजे:
method ला बाहेरून value घ्यायची आहे
ती value email textbox मध्ये टाकायची आहे

loginPage.enter_email("ajay@test.com");
किंवा
loginPage.enter_email(prop.getProperty("username"))*/