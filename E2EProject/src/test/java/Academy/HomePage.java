package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObject.LandingPage;
import pageObject.LoadingPage;
import resources.base;

public class HomePage extends base{
	// Adding logs using log4j
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigate(String username, String passwd, String text) throws IOException {
		
		driver.get(prop.getProperty("url"));
		// Two way to access method:
		// One is inheritance - keyword "extends"
		// The other is to create object to that class and invoke methods of it
		
	// 
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();  // driver.findElement(By.xpath())
		
		LoadingPage loadp = new LoadingPage(driver);
		loadp.getUsername().sendKeys(username);
		loadp.getPasswd().sendKeys(passwd);
		// Give one more value here
		log.info(text);
		
		loadp.getSubmit().click();
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
	
	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// Column stands for how many values per each test
		Object[][] data = new Object[2][3];  // Array needs correct size of values
		data[0][0] = "aaa@qq.com";
		data[0][1] = "aaaPassword";
		data[0][2] = "Restricted User";
		
		data[1][0] = "bbb@qq.com";
		data[1][1] = "bbbPassword";
		data[1][2] = "Non Restricted User";
		
		return data;
		
	}
	

}
