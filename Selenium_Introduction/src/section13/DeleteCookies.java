package section13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		// Delete all the cookies before testing
		driver.manage().deleteAllCookies();
		// Delete a specific one cookie
		//driver.manage().deleteCookieNamed("asdfxxxx");
		
		driver.get("http://lifx.com.au");
		

	}

}
