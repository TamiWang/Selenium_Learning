package section10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		
		// Open child window
		driver.findElement(By.xpath("//a[contains(@href,'https://accounts.google.com/TOS?')]")).click();
		// Get parent window title
		System.out.println(driver.getTitle());
		
		// Return all the handles for all the windows that are open. 
		// Note that when you put these in a list they are listed in the order that they have been opened.
		Set<String> ids = driver.getWindowHandles();
	    // Use java method iterator() to get childId
		Iterator<String> id = ids.iterator();
		String parentId = id.next();
		String childId = id.next();
		
		// Use childId to switch to child window
		driver.switchTo().window(childId);
		// Get child window title
		System.out.println(driver.getTitle());
		
		
	}

}
