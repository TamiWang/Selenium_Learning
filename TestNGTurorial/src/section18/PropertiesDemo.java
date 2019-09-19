package section18;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesDemo {
	
	@Test
	public void Login() throws IOException {
		
		// 1. Set global parameters by define an object of class Properties
		Properties prop = new Properties();
		// 2. Use class FileInputStream to find the location of the file
		FileInputStream fis = new FileInputStream("/Users/admin/git/selenium_learning/TestNGTurorial/src/section18/datadriven.properties");
		// 3. Load the fis to prop
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").contains("chrome")){
			WebDriver driver = new ChromeDriver();
		}
		

		
		
		
		
	}

}
