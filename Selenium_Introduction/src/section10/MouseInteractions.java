package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.au/");
		
		// Maximum screen
		driver.manage().window().maximize();
		
		WebElement move1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement move2 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

		Actions a = new Actions(driver);
		
		// Move the mouse to the specific element and input "hello" in Capital letters
		// Use build() and perform() to build and execute the entire action.
		// keyDown(Keys.SHIFT) -- Hold SHIFT key to convert Small letters to Capital letters
		// doubleClick() -- To select the content
		a.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		// Move the mouse to the specific element
		// Use build() and perform() to build and execute the entire action.
		// contextClick() -- Right click the specific element
		a.moveToElement(move2).contextClick().build().perform();
		


	}

}
