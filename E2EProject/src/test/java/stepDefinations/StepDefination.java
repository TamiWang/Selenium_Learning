package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoadingPage;
import pageObject.PortalHomePage;
import resources.base;

public class StepDefination extends base{
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Exception {
		driver = initializeDriver();

	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Exception {
		// Get the argument from feature file - url
		driver.get(arg1);
	}

	@Given("^Click on login link in home page to land on Secure sign in Page$")
	public void click_on_login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Exception {
		
		LandingPage lp = new LandingPage(driver);
		
		// Check if there is a pop-up on the page or not before processing the test
		if(lp.getPopUpSize() > 0) {
			// If pop-up, click "NO THANKS" button
			lp.getPopUp().click();
		}
		
		lp.getLogin().click(); 
		
		if(lp.getPopUpSize() > 0) {
			// If pop-up, click "NO THANKS" button
			lp.getPopUp().click();
		}
	}

//	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and log in$")
//	public void user_enters_and_and_log_in(String arg1, String arg2) throws Exception {
//		// Get the argument from feature file - Username and Password
//		LoadingPage loadp = new LoadingPage(driver);
//		loadp.getUsername().sendKeys(arg1);
//		loadp.getPasswd().sendKeys(arg2);
//		loadp.getSubmit().click();
//	}
	
    @When("^User enters (.+) and (.+) and log in$")
    public void user_enters_and_and_log_in(String username, String password) throws Throwable {
		// Parameterizing Selenium tests with Cucumber
		LoadingPage loadp = new LoadingPage(driver);
		loadp.getUsername().sendKeys(username);
		loadp.getPasswd().sendKeys(password);
		loadp.getSubmit().click();
    }

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Exception {
		// Verify the successfully login by checking if any element on the main page e.g. a check box, is displayed or not
//		PortalHomePage ph = new PortalHomePage(driver);
//		Assert.assertTrue(ph.getSearchBox().isDisplayed());
	}
	
	@And("^Close browsers$")
    public void close_browsers() throws Throwable {
        driver.quit();
    }


}
