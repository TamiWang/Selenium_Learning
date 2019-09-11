package section11;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		// August 23
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		// Locate the element with className because all the dates have same class name "day"
		// Different websites may have differnt common attribute, so 
		// Grab the common attribute, then put it into list and iterate it
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days']  th[class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int count = dates.size();
		
		for(int i=0; i<count; i++) {
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				dates.get(i).click();
				break;
			}
		}
		
		
		
	}

}
