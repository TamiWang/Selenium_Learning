package academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Questionnaire {
	
	WebDriver driver;
	
	public Questionnaire(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement productId() throws IOException {
		// Load Properties - Section19
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/admin//git/selenium_learning/MFiPortalTest/src/main/java/Academy/MFiFwUpdate.properties");

		prop.load(fis);
		
		// Set ppid in data.properties
		String ppid = prop.getProperty("ppid");
		// Insert
		String xpathPPID = String.format("//div[contains(text(),'%s')]", ppid);
		By productID = By.xpath(xpathPPID);
		return driver.findElement(productID);
	}
	
	public WebElement questionnaireView() {
		By view = By.xpath("//div[@id='pp-updateapprovedpp']//a[@class='actionLink'][contains(text(),'View questionnaire')]");
		return driver.findElement(view);
	}
	
	public WebElement questionnaireSubmit() {
		By submit = By.xpath("//a[contains(text(),'Submit update')]");
		return driver.findElement(submit);
	}
	
	public WebElement questionnaireFWUpdate() {
		By fwUpdate = By.xpath("//input[@value='label.ListNewFirmwareUpdate']");
		return driver.findElement(fwUpdate);
	}
	
	public WebElement questionnaireUnclick() {
		By fwUnclick = By.xpath("//input[@value='label.ListNewNetworkDeclarations']");
		return driver.findElement(fwUnclick);
	}
	
    public WebElement questionnaireFWVersion() {
		By fwVersion = By.xpath("//input[@id='labelTextNewFirmwareVersion']");
		return driver.findElement(fwVersion);
	}
    
    public WebElement questionnaireCalender() {
    	By fwCalender = By.xpath("//input[@name='label.HKexpectedreleasedate']");
    	return driver.findElement(fwCalender);
    }
    
    public WebElement questionnaireDate() {
    	// Select 29th as release date
    	By fwReleaseDate = By.xpath("//a[contains(text(),'29')]");
    	return driver.findElement(fwReleaseDate);
    }
    
    public WebElement questionnaireCalenderNext() {
    	By fwCalenderNext = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
    	return driver.findElement(fwCalenderNext);
    }
    
    public WebElement questionnaireSpecV() {
    	By fwSpecVersion = By.xpath("//select[@id='labelAccessoryProtocolSpecification']");
    	return driver.findElement(fwSpecVersion);
    }
    
    public WebElement questionnaireComply() {
    	By fwComply = By.xpath("//input[@id='labelFirmwareVersionWithAccessoryProtocolSpecificationYes']");
    	return driver.findElement(fwComply);
    }
    
    public WebElement questionnaireChanges() {
    	By fwChanges = By.xpath("//textarea[@id='labelTextNewFirmwareChangesInDetail']");
    	return driver.findElement(fwChanges);
    }
    
    public WebElement questionnaireImpact() {
    	By fwImpact = By.xpath("//textarea[@id='labelHomeKitImplementation']");
    	return driver.findElement(fwImpact);
    }
  
  
}
