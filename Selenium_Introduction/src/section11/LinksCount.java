package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		// 1. Get count of links on the page
		// link has a tagName "a"
		System.out.println("count of links on the whole page: " + driver.findElements(By.tagName("a")).size());
		
//		driver.get("https://www.lifx.com/");
//		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. Limiting webdriver scope to footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("count of links on the footer page: " + footerdriver.findElements(By.tagName("a")).size());
		
		// 3. Limiting webdriver scope to the first column of footer
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("count of links in the first column on the footer page: " + columndriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each link in the column and check if the pages are opening.
		// Open all the tabs
		for(int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			// Open the links in separate Tabs -  COMMAND+ENTER(iOS) or CONTROL+ENTER(windows)
			String clickonlinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			// keyboard event - sendKeys()
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
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
