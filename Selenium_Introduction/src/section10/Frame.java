package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://jqueryui.com/droppable/");
		
		
		// Find all the iframe tag in the application
		System.out.println("how many iframes: " + driver.findElements(By.tagName("iframe")).size());
		
		// Switch to frame with WebElement - element starts with iframe tag
		// driver.switchTo().frame()
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		
		// If there is only one frame, simply use index to switch to
		// driver.switchTo().frame(0);
		
		// Using Actions class to drag box
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		// drag and drop
		a.dragAndDrop(source, target).build().perform();
		
		// Switch back to the previous normal window
		driver.switchTo().defaultContent();
		
		
		

	}

}
