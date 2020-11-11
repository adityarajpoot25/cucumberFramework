package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_Page {

	public Billing_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "dwfrm_billing_paymentMethods_creditCard_owner")
	public WebElement nameOnCard;
	
	@FindBy(id = "dwfrm_billing_paymentMethods_creditCard_number")
	public WebElement cardNumber;
	
	@FindBy(id = "Expires")
	public WebElement expiryDate;
	
	@FindBy(id = "dwfrm_billing_paymentMethods_creditCard_cvn")
	public WebElement securityCode;
	
	@FindBy(xpath = "//button[@value='NEXT STEP: PAYMENT INFO']")
	public WebElement reviewButton;
	
	public void enterCreditCardDetails() throws InterruptedException {
		nameOnCard.sendKeys("Visa");
		cardNumber.sendKeys("4111111111111111");
		 expiryDate.sendKeys("12/23");
		 try {
			securityCode.sendKeys("123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Thread.sleep(3000);
		 reviewButton.click();
	}
	
}
