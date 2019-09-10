package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Section11Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
        // 1. Select any checkbox
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		// 2. Grab the label of the selected checkbox (put into variable)
		String optionText = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		
		// 3. Select an option in dropdown.Here option to select should come from step 2
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(optionText);
		
		// 4. Enter the step 2 grabbed label text in Editbox
		driver.findElement(By.name("enter-name")).sendKeys(optionText);
		
		// Or 
//		Actions a = new Actions(driver);
//		WebElement move = driver.findElement(By.id("name"));
//		a.moveToElement(move).click().sendKeys(optionText).build().perform();
		
		// 5. Click Alert and then verify if text grabbed from step 2 is present in the pop up message
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		if(alertText.contains(optionText)) {
			System.out.println("alertText contains " + optionText);
		}

		

		
	}

}
