package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		
		// hidden text
		// key down (arrow down) to move to the expected option
		source.sendKeys(Keys.ARROW_DOWN);
		// click enter
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		// arrow down three times
		for(int i=0; i<3; i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		// click enter
		destination.sendKeys(Keys.ENTER);
		
	}

}