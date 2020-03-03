package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	// Give this keyword "driver" as public instead of private, so "driver" can be accessible outside the class
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		// Load Properties - Section19
		prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/resources/MFiFwUpdate.properties");
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		// You CANNOT use "==" when you extract value from data.properties file, should use browserName.equals(browserName)
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/resources/chromedriver");
			
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			//driver = new IEDriver();
		}
		
		// Set timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

}
