package section9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchroniz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("FH-origin")).sendKeys("nyc");
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("FH-destination")).sendKeys("la");
		driver.findElement(By.id("FH-destination")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("FH-fromDate")).sendKeys(Keys.ENTER);
		
		// explicit wait
		// to target a specific element
		WebDriverWait d = new WebDriverWait(driver, 10);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		
		// Thread.sleep(5000L);
		
		driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
		

	}

}
