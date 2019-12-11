package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	// Create a local object "driver"
	WebDriver driver;
	
	// Create a constructor with argument
	public HomePage(WebDriver driver) {
		// Assign the testcase driver to local driver object
		// Use keyword this to differentiate two drivers
		this.driver = driver;
	}
	
	By username = By.id("accountname");
	By passwd = By.id("accountpassword");
	By submit = By.id("submitButton2");

	//By submit = By.xpath("//input[@type='submit']");
	
	public WebElement userName() {
		return driver.findElement(username);
	}
	
	public WebElement passWd() {
		return driver.findElement(passwd);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}

}
