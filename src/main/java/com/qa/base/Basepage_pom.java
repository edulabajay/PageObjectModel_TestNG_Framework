package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.utils_pom.UtilsTest;
import com.utils_pom.WebEventListener;


public class Basepage_pom {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	
	//Logger
	Logger log = Logger.getLogger(Basepage_pom.class);

	//Super class Constructor
	public Basepage_pom() {

		try {

			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\info\\eclipse-workspace\\Framework_Structure\\src\\main\\java\\com\\config\\config.properties");
			prop.load(ip);	

		}catch (FileNotFoundException e) {


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Invoke browser
	public static void initialize() {

		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}

		//Listener
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;



		//Waits
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilsTest.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilsTest.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);


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




















