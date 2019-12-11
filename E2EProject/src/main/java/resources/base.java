package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	// Make below objects public, so as a parent class, it's child class can access those objects.
	// Make driver static, so it can be shared among all object, as global variables, so it can 
	// only be modified but not created when it is present in a program
	public static WebDriver driver; 
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		// Generating paths dynamically by using System.getProperty("user.dir") 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/resources/data.properties");
		
		prop.load(fis);
		
		// If you want to pass browser from Maven command instead of putting it in data.properies, use System.getProperty("browser") 
		// and give Mavnen command $ mvn test -Dbrowser=chrome
		//String browserNameMaven = System.getProperty("browser");
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/resources/chromedriver");
			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			// run tests in chrome headless mode
			// When running headless, make sure you have the latest selenium version
			if(browserName.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			// driver = new IEDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException {
		// WebDriver captures a screenshot and take it into a file
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Cope "src" variable into your local folder
		FileUtils.copyFile(src, new File("/Users/admin/git/selenium_learning/test_screenshot/" + result + "screenshot.png"));
	}

}
