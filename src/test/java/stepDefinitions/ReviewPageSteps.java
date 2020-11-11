package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.Review_Page;

public class ReviewPageSteps extends WebDriverManager {
	TestContext testContext;
	Review_Page reviewPage;
	WebDriver driver;

	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;

	public ReviewPageSteps(TestContext context) {
		testContext = context;
		reviewPage = testContext.getPageObjectManager().getReviewPage();
	}

	@When("^place the order$")
	public void place_the_order() {
		reviewPage.ReviewcompletePurchase();
//		closeDriver();
	}

}
