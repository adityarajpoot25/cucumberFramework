package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.Shipping_Page;

public class ShippingPageSteps {
	TestContext testContext;
	 Shipping_Page shippingPage;
	 WebDriver driver;
	
	 PageObjectManager pageObjectManager; 
	 WebDriverManager webDriverManager;
	
	
		public ShippingPageSteps(TestContext context) {
			 testContext = context;
			 shippingPage = testContext.getPageObjectManager().getShippingPage();
			 }
		
		@When("^enter personal details on checkout page$")
		public void enter_personal_details_on_checkout_page() throws InterruptedException {
			shippingPage.SignIn_Checkout();
			shippingPage.enterShippingAddress();
		}
	

}
