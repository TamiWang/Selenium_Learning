package section13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
//import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		
		driver.get("http://lifx.com.au");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		Files.copy(src, new File("/Users/admin/Downloads/screenshot.png"));

	}

}
