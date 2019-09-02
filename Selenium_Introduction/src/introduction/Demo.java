package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lifx.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("//*[@id='header-btn']/span/a/button")).click();
		//<span class="no-br unselectable">Support</span>
		//*[@id="LIFXnavbar"]/ul/li[5]/a/div/span
		driver.findElement(By.xpath("//*[@id=\"LIFXnavbar\"]/ul/li[5]/a/div/span")).click();
		
		driver.findElement(By.xpath("//*[@class='login']")).click();
	
		//driver.close();
	

	}

}
