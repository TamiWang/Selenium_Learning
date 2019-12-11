package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionnairePage {
	WebDriver driver;
	
	public QuestionnairePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By submitQuestion = By.xpath("//a[contains(text(),'Submit questionnaire')]");
	private By editButton = By.xpath("//button[@id='btn-edit']");
	private By licenseVerify = By.xpath("//input[@id='labelListRecertWacProductComplianceLicenseeVerificationConfigCreation']");
	private By supportWireless = By.xpath("//input[@id='labelListRecertWacSupportWirelessYes']");
	private By standards = By.xpath("//span[contains(text(),'What standards?')]");
	private By securityMode = By.xpath("//span[contains(text(),'What security modes are supported by your accessor')]");
	private By standardG = By.id("labelListRecertWacStandardsG");
	private By standardB = By.id("labelListRecertWacStandardsB");
	private By standardN = By.id("labelListRecertWacStandardsN");
	private By securityNone = By.id("labelListRecertWacSupportSecurityNone");
	private By securityPersonal = By.id("labelListRecertWacSupportSecurityWpa_Personal");
	private By securityPersonal2 = By.id("labelListRecertWacSupportSecurityWpa2_Personal");
	private By ipv6Support = By.xpath("//span[contains(text(),'Does your accessory support iPv6?')]");
	private By ipv6Yes = By.id("labelListRecertWacSupportIpv6Yes");
	private By fwVersion = By.xpath("//input[@id='labelListRecertHKCurrentFirmwareVer']");
	private By specVersion = By.id("labelListRecertHKSpecVersionSupported");
	private By wifiCertID = By.id("labelListRecertHKWiFiCertificateId");
	private By bctPass = By.id("labelListRecertHKPassedBCTAnswer");
	private By bctDescription = By.id("labelListRecertHKBCTTestProceduresInstructions");
	private By hapTest = By.id("labelListRecertHKTestedWithHCAAndHAT");
	private By hkTestCase = By.id("labelListRecertHKTestedWithHKSelfCertification");
	private By wacTest = By.id("labelListRecertHKSupportsWAC");
	private By otaTest = By.id("labelListRecertHKCanReceiveOTAUpdates");
	private By otaMethod = By.id("labelListRecertHKFirmwareMethodUpdateUpdatedThroughAccessory");
	private By otaInstruction = By.id("labelListRecertHKFirmwareInstructionNote");
	private By homeApp = By.id("labelListRecertHKCanSetupHomeApp");
	private By endUser = By.id("labelListRecertHKTestedWithHKAdditionalFee");
	private By hapSpec = By.id("labelListRecertHKTestedWithHKProtocalSpec");
	private By changes = By.id("labelListRecertHKTextNewFirmwareChangesInDetail");
	private By adkUsed = By.id("labelListRecertHKchoiceOverHomeKitHDKYes");
	private By thirdParty = By.id("labelListRecertHKchoiceOverHAPImplemetaionNo");
	private By adkLibrary = By.id("labelListRecertHKHomeKitADKBinary");
	
	private By adkVersion = By.id("labelListRecertHKHomeKitADKVersion");
	private By hkToolChain = By.id("labelListRecertHKHomeKitToolChainMinVersion");
	private By palImp = By.id("labelListRecertHKchoiceOverPlatformAbstractLayerYes");
	private By palName = By.id("labelListRecertHKHomeKitCustomPAL");
	private By palCustomizations = By.id("labelListRecertHKHomeKitCustomizationPAL");
	private By resetConfig = By.id("labelListRecertHKresetWifiNo");
	private By adtionalAuth = By.id("labelListRecertHKAccessoryUsesAdditionalDataNo");
	
	private By hatFile = By.id("labelListRecertHKHATFile");
	private By userManual = By.id("labelListRecertHKUserManual");
	private By fwRecertification = By.id("labelListRecertHKFirmwareForRecertification");
	private By bctResult = By.id("labelListRecertHKBCTFiles");
	private By bctSetup = By.id("labelListRecertHKBCTInstructionsFiles");
	
	

	
	public WebElement openQuestion() {
		return driver.findElement(submitQuestion);
	}
	
	public WebElement editQuestion() {
		return driver.findElement(editButton);
	}
	
	public WebElement licenseVerifyClick() {
		return driver.findElement(licenseVerify);
	}
	
	public WebElement supportWirelessCom() {
		return driver.findElement(supportWireless);
	}
	
	public WebElement standardsSupport() {
		return driver.findElement(standards);
	}
	
	public WebElement standardG() {
		return driver.findElement(standardG);
	}
	
	public WebElement standardB() {
		return driver.findElement(standardB);
	}
	
	public WebElement standardN() {
		return driver.findElement(standardN);
	}
	
	public WebElement securityModeSupport() {
		return driver.findElement(securityMode);
	}
	
	public WebElement securityNone() {
		return driver.findElement(securityNone);
	}
	
	public WebElement securityPersonal() {
		return driver.findElement(securityPersonal);
	}
	
	public WebElement securityPersonal2() {
		return driver.findElement(securityPersonal2);
	}
	
	public WebElement ipv6Support() {
		return driver.findElement(ipv6Support);
	}
	
	public WebElement ipv6Yes() {
		return driver.findElement(ipv6Yes);
	}
	
	public WebElement fwVersion() {
		return driver.findElement(fwVersion);
	}
	
	public WebElement specVersion() {
		return driver.findElement(specVersion);
	}
	
	public WebElement wifiCertID() {
		return driver.findElement(wifiCertID);
	}
	
	public WebElement BCTPass() {
		return driver.findElement(bctPass);
	}
	
	public WebElement BCTDescription() {
		return driver.findElement(bctDescription);
	}
	
	public WebElement HAPTest() {
		return driver.findElement(hapTest);
	}
	
	public WebElement HKTestCase() {
		return driver.findElement(hkTestCase);
	}
	
	public WebElement WACTest() {
		return driver.findElement(wacTest);
	}
	
	public WebElement OTATest() {
		return driver.findElement(otaTest);
	}
	
	public WebElement OTAMethod() {
		return driver.findElement(otaMethod);
	}
	
	public WebElement OTAInstruction() {
		return driver.findElement(otaInstruction);
	}
	
	public WebElement HomeApp() {
		return driver.findElement(homeApp);
	}
	
	public WebElement EndUser() {
		return driver.findElement(endUser);
	}
	
	public WebElement HAPSpec() {
		return driver.findElement(hapSpec);
	}
	
	public WebElement Changes() {
		return driver.findElement(changes);
	}
	
	public WebElement ADKUsed() {
		return driver.findElement(adkUsed);
	}
	
	public WebElement ThirdParty() {
		return driver.findElement(thirdParty);
	}
	
	public WebElement ADKLibrary() {
		return driver.findElement(adkLibrary);
	}
	
	public WebElement ADKVersion() {
		return driver.findElement(adkVersion);
	}
	
	public WebElement HKToolChain() {
		return driver.findElement(hkToolChain);
	}
	
	public WebElement PALImp() {
		return driver.findElement(palImp);
	}
	
	public WebElement PALName() {
		return driver.findElement(palName);
	}
	
	public WebElement PALCustomizations() {
		return driver.findElement(palCustomizations);
	}
	
	public WebElement ResetConfig() {
		return driver.findElement(resetConfig);
	}
	
	public WebElement AdditonalAuth() {
		return driver.findElement(adtionalAuth);
	}
	
	public WebElement HATFile() {
		return driver.findElement(hatFile);
	}
	
	public WebElement UserManual() {
		return driver.findElement(userManual);
	}
	
	public WebElement FWRecertification() {
		return driver.findElement(fwRecertification);
	}
	
	public WebElement BCTResult() {
		return driver.findElement(bctResult);
	}
	
	public WebElement BCTSetup() {
		return driver.findElement(bctSetup);
	}
	
}
