package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement checkB = driver.findElement(By.id("checkBoxOption1"));

		// Verify checked
		checkB.click();
		Thread.sleep(2000);
		Assert.assertTrue(checkB.isSelected());
		System.out.println(checkB.isSelected());
		
		// Verify unchecked
		checkB.click();
		Thread.sleep(2000);
		Assert.assertFalse(checkB.isSelected());
		System.out.println(checkB.isSelected());
		
		// Get the count of number
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
