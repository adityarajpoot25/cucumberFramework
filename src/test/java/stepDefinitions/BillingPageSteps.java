package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.Billing_Page;

public class BillingPageSteps {
	TestContext testContext;
	 Billing_Page billingPage;
	 WebDriver driver;
	
	 PageObjectManager pageObjectManager; 
	 WebDriverManager webDriverManager;
	public BillingPageSteps(TestContext context) {
		 testContext = context;
		 billingPage = testContext.getPageObjectManager().getBillingPage();
	}
	
	@When("^select same delivery address$")
	public void select_same_delivery_address() throws InterruptedException {

		billingPage.enterCreditCardDetails();
	}

}
