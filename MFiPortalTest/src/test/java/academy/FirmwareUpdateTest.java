package academy;

import org.testng.annotations.Test;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import resources.HomePage;
import resources.Questionnaire;
import resources.base;

public class FirmwareUpdateTest extends base{
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		HomePage hp = new HomePage(driver);
		hp.userName().sendKeys(prop.getProperty("username"));
		hp.passWd().sendKeys(prop.getProperty("passwd"));
		hp.submit().click();
		
		Questionnaire qs = new Questionnaire(driver);
		// Configure data.properties to choose correct PPID in MFi Protal
		qs.productId().click();
		
		Thread.sleep(5000);
        // Go to submit questionnaire page
		qs.questionnaireSubmit().click();
		// Tick Firmware update option
		Thread.sleep(3000);
		qs.questionnaireFWUpdate().click();
		// Unselect Add/edit network declarations option
		qs.questionnaireUnclick().click();
		// Fill in firmware version - from data.properties
		qs.questionnaireFWVersion().sendKeys(prop.getProperty("fwVersion"));

		
		// Select Release Date
		qs.questionnaireCalender().click();
		qs.questionnaireCalender().click();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		Date today = Calendar.getInstance().getTime();
		String date = dateFormat.format(today).substring(0, 2);
		System.out.println("Today's date is " + date);
		
		int currentDate = Integer.parseInt(date);
		
		if((currentDate>=1) & (currentDate<=15)) {
			// If today is the first half of the month, select 29th as release date
			qs.questionnaireDate().click();
		}
		else if(currentDate>15) {
			// If today is the second half of the month, select next month as release date
			qs.questionnaireCalenderNext().click();
			qs.questionnaireDate().click();
		}
		
		Thread.sleep(2000);
		// Select HomeKit Spec Version - Set HKVersion in data.properties
		qs.questionnaireSpecV().click();
		String HKVersion = prop.getProperty("HKVersion");
    	Select s = new Select(qs.questionnaireSpecV());
    	s.selectByVisibleText(HKVersion);
    	
    	Thread.sleep(2000);
    	// New firmware version comply with the current HAP version
    	qs.questionnaireComply().click();
    	
    	Thread.sleep(2000);
    	// Update firmware changes - Set fwChanges in data.properties
    	String fwChanges = prop.getProperty("fwChanges");
    	qs.questionnaireChanges().sendKeys(fwChanges);
    	
    	Thread.sleep(2000);
    	// Update firmware impact - Set fwImpact in data.properties
    	String fwImpact = prop.getProperty("fwImpact");
    	qs.questionnaireImpact().sendKeys(fwImpact);
    	
	}

}
