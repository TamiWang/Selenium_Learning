package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		// driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

		// All the radio buttons have the same Attribute
		// Use list iteration and "findElements" to get expected radio button
		for (int i = 0; i < count; i++) {
			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

			if (text.equals("Butter")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

	}

}
