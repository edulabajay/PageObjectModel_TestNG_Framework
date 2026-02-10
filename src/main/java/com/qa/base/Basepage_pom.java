package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utils_pom.UtilsTest;



public class Basepage_pom {


	public static WebDriver driver;
	public static Properties prop;




	//Super class Constructor
	public Basepage_pom() {    //ConfigReader

		try {

			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\info\\eclipse-workspace\\Framework_Structure_POM_Maven_TestNG Suite\\src\\main\\java\\com\\config\\config.properties");
			prop.load(ip);	

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// Initializing / Invoke browser
	public static void initialize() {

		 // 1) ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // 2) Password manager complete OFF
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        // 3) (OPTIONAL) Notifications बंद
        options.addArguments("--disable-notifications");

        // 4) (OPTIONAL) direct incognito मधे run
        //  incognito मध्ये password save होतच नाही
        options.addArguments("--incognito");

        // 5) MUST: driver = new ChromeDriver(options);
        driver = new ChromeDriver(options);

        // 6) बाकी तुझे existing settings
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(UtilsTest.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(UtilsTest.IMPLICIT_WAITS, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }

	}




/*All In Short
>Parent class of all class because all class extended by base class
>Initialize WebDriver
>My Properties define here like config.properties
>Define All the Page Load Time Out [Page Load timeout, Implicit Wait,Explicit wait
>define get(url) here

>Actually, it is not good practice to define a webdriver individually for the Login/HomePage/Dashboard pages. 
Instead, a better practice is to define the webdriver once in a base class as the parent class, and then extend or inherit this base class in the child classes representing the Login/HomePage/Dashboard pages, with the base class as the parent class.

 */




















