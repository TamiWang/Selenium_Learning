package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		//  //a[@value='MAA']  - xpath for chennai
	    //  //a[@value='BLR'] 
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// option 1
//		// Handling dynamic dropdowns - index
//		// To select the 2nd matching nodes of chennai because chennai has multiple nodes that
//		// have same xpath
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		// option 2 - use parent-child relationship
		// parent-xpath child-xpath (there is a space in between)
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		
	}
	

}
