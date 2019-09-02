package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//a[@onclick=\"alert('Hello There!');\"]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		//driver.switchTo().alert().sendKeys("sfsdf");
		
		driver.switchTo().alert().accept(); // Accept == ok done yes
		
		//driver.switchTo().alert().dismiss();
	}

}
