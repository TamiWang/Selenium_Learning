package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Define Object on the top
	// Encapsulation OOPS principle
	// Public Methods and Private Variables
	private By signin = By.xpath("//span[contains(text(),'Login')]");
	private By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By InterGuide = By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Interview Guide')]");
	private By header = By.xpath("//p[contains(text(),'Learn Hot tools like Selenium, Appium, JMeter, Soa')]");
	private By popUp = By.xpath("//button[text()='NO THANKS']");
	
	// Define Method at the bottom
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	
	public  WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getInterGuide() {
		return driver.findElement(InterGuide);
	}
	
	public WebElement getHeader() {
		return driver.findElement(header);
	}
	
	public int getPopUpSize() {
		return driver.findElements(popUp).size();
	}
	
	public WebElement getPopUp() {
		return driver.findElement(popUp);
	}

}
