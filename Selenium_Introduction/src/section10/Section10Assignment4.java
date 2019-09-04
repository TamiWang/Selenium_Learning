package section10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section10Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		String parentId = id.next();
		String childId = id.next();
		
		driver.switchTo().window(childId);
		String childText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(childText);
		
		driver.switchTo().window(parentId);
		String parentText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(parentText);

	}

}
