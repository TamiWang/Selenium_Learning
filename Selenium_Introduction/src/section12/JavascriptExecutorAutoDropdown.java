package section12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Requirement: Enter the letters BENG
//              Verify if Airport option is displayed in the suggestive box

public class JavascriptExecutorAutoDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

		//JavaScript DOM can extract hidden elements in java
		//because Selenium cannot identify hidden elements - (Ajax implementation)
		//Investigate the properties of object if it has any hidden text or not

		//JavascriptExecutor API
		// https://www.w3schools.com/js/js_htmldom.asp
		// Create an object of Class JavascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;

		// Use "return" to retrieve value in JavaScript
		// Use System.out.print() to retrieve value in Java
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		// Java cannot print hidden elements, but using JavaScript the hidden element is able to be printed out
		System.out.println(text);
		int i =0;
		//BENGALURU INTERNATION AIRPORT
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

			text=(String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10)
			{
				break;
			}

		}

		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element  found");
		}

	}

}
