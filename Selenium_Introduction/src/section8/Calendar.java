package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com");
		
		// RETURN DATE 
		// Using isEnabled() to verify if RETURN DATE is enabled or disabled will always fail
		// because although RETURN DATE is disabled from UI perspective it is still able to be modified.
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		// So will use "style" attribute to verify
		
		// Get Attribute "style" of element RETURN DATE before selecting Round Trip
		// display: block; opacity: 0.5;
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		// Select Round Trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// Get Attribute "style" of element RETURN DATE after selecting Round Trip
		// display: block; opacity: 1;
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		// Attribute "style" is changeable
		// If it contains "1", it means RETURN DATE element is enabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		    System.out.println("its enabled");
		    Assert.assertTrue(true);
		}
		else
		{
			// RETURN DATE element is disabled
		    Assert.assertTrue(false);
		}

	}

}
