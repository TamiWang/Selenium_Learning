package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com");
		
		// Verify that the checkout has not been selected
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		// Verify that the checkout has been selected now
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
	    // Count the number of checkboxes
		
		System.out.println("There are " + driver.findElements(By.cssSelector("input[type='checkbox']")).size() + " checkboxes.");
			
		
		
		

	}

}
