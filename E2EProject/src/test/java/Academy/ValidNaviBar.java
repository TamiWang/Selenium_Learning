package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class ValidNaviBar extends base{
	
	// Adding logs using log4j
	public static Logger log = LogManager.getLogger(ValidTitle.class.getName());
	
	// Put common steps before test
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validateAppNavBar() throws IOException {
		// Two way to access method:
		// One is inheritance - keyword "extends"
		// The other is to create object to that class and invoke methods of it
		
		LandingPage lp = new LandingPage(driver);
		
		// Assert the condition
		AssertJUnit.assertTrue(lp.getInterGuide().isDisplayed());
		log.info("Navigated bar displayed");
		
	}
	
	// Close browser after the test
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
