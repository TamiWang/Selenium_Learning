package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LifxLinksCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lifx.com.au/");
		
		// 1. Get count of links on the page
		// link has a tagName "a"
		System.out.println("count of links on the whole page: " + driver.findElements(By.tagName("a")).size());
		
		//WebElement lifxDriver = driver.findElement(By.xpath("//html"));
		//WebElement lifxDriver = driver.findElement(By.xpath("//div[@class='nav-folderized']"));
		
		
		//WebElement lifxDriver = driver.findElement(By.xpath("//div[@class='container footer-container']"));
		WebElement lifxDriver = driver.findElement(By.xpath("//footer[@class='footer-bg']/div[2]"));
		System.out.println("count of links on the whole page 2: " + lifxDriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each link in the column and check if the pages are opening.
		// Open all the tabs
		for(int i = 0; i < lifxDriver.findElements(By.tagName("a")).size(); i++) {
			// Open the links in separate Tabs -  COMMAND+ENTER(iOS) or CONTROL+ENTER(windows)
			String clickonlinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			// keyboard event - sendKeys()
			lifxDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}
		
		Thread.sleep(5000L);
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		// Get each title on each link
		while(it.hasNext()) {
			//Move to next opened window
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
