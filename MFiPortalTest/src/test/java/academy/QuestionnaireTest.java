package academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.QuestionnairePage;
import resources.HomePage;
import resources.Questionnaire;
import resources.base;


public class QuestionnaireTest extends base{
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void submitQuestionnaire() throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);
		hp.userName().sendKeys(prop.getProperty("username"));
		hp.passWd().sendKeys(prop.getProperty("passwd"));
		hp.submit().click();
		
		Questionnaire qs = new Questionnaire(driver);
		// Configure data.properties to choose correct PPID in MFi Protal
		qs.productId().click();
		
		Thread.sleep(5000);
		QuestionnairePage qp = new QuestionnairePage(driver);
		qp.openQuestion().click();
		qp.editQuestion().click();
		
		// License verification
		qp.licenseVerifyClick().click();
		
		// support wireless communication
		qp.supportWirelessCom().click();
		
		// standards
		if (qp.standardsSupport().isDisplayed()) {
			qp.standardG().click();
			qp.standardB().click();
			qp.standardN().click();
		}
		
		// security mode
		if (qp.securityModeSupport().isDisplayed()) {
			qp.securityNone().click();
			qp.securityPersonal().click();
			qp.securityPersonal2().click();
			
		}
		
		//ipv6 support
		if(qp.ipv6Support().isDisplayed()) {
			qp.ipv6Yes().click();
		}
		
		// Firmware version for submission
		qp.fwVersion().sendKeys(prop.getProperty("firmwareVersion"));
		
		
		// Spec version supported
		qp.specVersion().sendKeys(prop.getProperty("specVersion"));
		
		//wifi certification ID
		qp.wifiCertID().sendKeys(prop.getProperty("wifiCertID"));
		
		// BCT pass 
		qp.BCTPass().click();
		
		// BCT Description
		qp.BCTDescription().sendKeys(prop.getProperty("BCTDescription"));
		
		// HAP
		qp.HAPTest().click();
		
		// Homekit Test
		qp.HKTestCase().click();
		
		// WAC
		qp.WACTest().click();
		
		// OTA
		qp.OTATest().click();
		
		// OTA method
		qp.OTAMethod().click();
		
//		PropertiesConfigurationLayout pf = new PropertiesConfigurationLayout();
//
//		pf.setLineSeparator(prop.getProperty("otaInstruction1"));
//		pf.setLineSeparator(prop.getProperty("otaInstruction2"));
		
		// firmware update instruction
		qp.OTAInstruction().sendKeys(prop.getProperty("otaInstruction"));
		
		// Home App
		qp.HomeApp().click();
		
		// End User
		qp.EndUser().click();
		
		// HAP Spec
		qp.HAPSpec().click();
		
		// Changes since previous submission
		qp.Changes().sendKeys(prop.getProperty("Changes"));
		
		// ADK used
		qp.ADKUsed().click();
		
		// Third Party
		qp.ThirdParty().click();
		
		// ADK Library
		qp.ADKLibrary().sendKeys(prop.getProperty("ADKLibrary"));
		
		
		// ADK Version
		qp.ADKVersion().sendKeys(prop.getProperty("ADKVersion"));
		
		//HK Tool Chain
		qp.HKToolChain().sendKeys(prop.getProperty("ToolChain"));
		
		//PAL Implement
		qp.PALImp().click();
		
		// PAL Name
		qp.PALName().sendKeys(prop.getProperty("PALName"));
		
		//PAL Customizations
		qp.PALCustomizations().sendKeys(prop.getProperty("PALCustomizations"));
		
		// Reset without pairing
		qp.ResetConfig().click();
		
		//Additional Authorization data
		qp.AdditonalAuth().click();
		
		// logs
		qp.HATFile().click();
		qp.UserManual().click();
		qp.FWRecertification().click();
		qp.BCTResult().click();
		qp.BCTSetup().click();
		
	
	}
	

}
