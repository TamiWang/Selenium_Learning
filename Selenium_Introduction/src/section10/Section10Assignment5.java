package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section10Assignment5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		// nested frame
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
