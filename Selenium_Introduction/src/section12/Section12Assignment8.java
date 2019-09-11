package section12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		String expectText = "United Kingdom";
		
		driver.findElement(By.id("autocomplete")).sendKeys("UNITED");
		
		Thread.sleep(2000L);
		
		
		// If it's a hidden element, you can use 1> JavaScript or 2> getAttribute("value") to locate hidden element
		
		// 2> getAttribute("value")
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		// 1> JavaScript
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"autocomplete\").value;";
		
		String text = (String)js.executeScript(script);
		
		int i = 0;
		
		while(!text.equalsIgnoreCase(expectText)) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			
			text = (String)js.executeScript(script);
			System.out.println(text);
			
			if(i>6) {
				break;
			}
		}
		
		if(i>6) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found: " + text);
		}
		

	}

}
