package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import pageObject.LandingPage;
import resources.base;

public class ValidTitle extends base{
	// Adding logs using log4j
	public static Logger log = LogManager.getLogger(ValidTitle.class.getName());
	
	// Two way to access method:
	// One is inheritance - keyword "extends"
	// The other is to create object to that class and invoke methods of it
	LandingPage lp;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
	}
	
	@Test
	public void validateAppTitle() throws IOException {
		
		lp = new LandingPage(driver);
		// Compare the text from the browser with actual text by using TestNG Assert
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated Text message");
	}
	
	@Test
	public void validAppHeader() {
		Assert.assertEquals(lp.getHeader().getText(), "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
		log.info("Successfully validated Header");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
	

}
