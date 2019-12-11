package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoadingPage {
	
	public WebDriver driver;
	
	// Using constructor to initialize the object with argument
	public LoadingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Encapsulation OOPS principle
	// Public Methods and Private Variables
	private By username = By.xpath("//input[@id='user_email']");
	private By password = By.xpath("//input[@id='user_password']");
    private	By submit = By.xpath("//input[@name='commit']");
	
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	
	public WebElement getPasswd() {
		return driver.findElement(password);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	
	

}
