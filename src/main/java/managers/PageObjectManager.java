package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.Billing_Page;
import pageObjects.Cart_Page;
import pageObjects.PDP_Page;
import pageObjects.PLP_Page;
import pageObjects.Review_Page;
import pageObjects.Shipping_Page;

public class PageObjectManager {

	private WebDriver driver;
	private PLP_Page pLPPage;
	private PDP_Page pDPPage;
	private Cart_Page cartPage;
	private Shipping_Page shippingPage;
	private Billing_Page billingPage;
	private Review_Page reviewPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public PLP_Page getPLPPage() {

		return (pLPPage == null) ? pLPPage = new PLP_Page(driver) : pLPPage;

	}

	public PDP_Page getPDPPage() {

		return (pDPPage == null) ? pDPPage = new PDP_Page(driver) : pDPPage;

	}

	public Cart_Page getCartPage() {

		return (cartPage == null) ? cartPage = new Cart_Page(driver) : cartPage;

	}

	public Shipping_Page getShippingPage() {

		return (shippingPage == null) ? shippingPage = new Shipping_Page(driver) : shippingPage;

	}

	public Billing_Page getBillingPage() {

		return (billingPage == null) ? billingPage = new Billing_Page(driver) : billingPage;

	}

	public Review_Page getReviewPage() {

		return (reviewPage == null) ? reviewPage = new Review_Page(driver) : reviewPage;

	}

}
