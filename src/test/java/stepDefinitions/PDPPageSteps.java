package stepDefinitions;

import java.awt.AWTException;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.Cart_Page;
import pageObjects.PDP_Page;

public class PDPPageSteps {

	TestContext testContext;
	PDP_Page pDPage;
	Cart_Page cartPage;
	
	public PDPPageSteps(TestContext context) {
		testContext = context;
		pDPage = testContext.getPageObjectManager().getPDPPage();
		cartPage = testContext.getPageObjectManager().getCartPage();
	}
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws AWTException {
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", pDPage.AddToCart);
		pDPage.addToCart();
		pDPage.viewBag();
		cartPage.checkout_MiniCart();
	}

}
