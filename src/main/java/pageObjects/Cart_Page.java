package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@name='dwfrm_cart_checkoutCart']")
	public WebElement continueToCheckout;
	
	public void checkout_MiniCart() {
		continueToCheckout.click();
	}
}
