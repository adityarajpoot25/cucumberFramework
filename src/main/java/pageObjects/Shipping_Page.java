package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {

	
	public Shipping_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "dwfrm_login_username")
	public WebElement emailID;
	
	@FindBy(id = "dwfrm_login_password")
	public WebElement password;
	
	@FindBy(xpath = "//button[@name='dwfrm_login_login']")
	public WebElement signIn;
	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_firstName")
	public WebElement firstName;
	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_lastName")
	public WebElement lastName;
	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_address1")
	public WebElement AddressLine1;
	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_city")
	public WebElement city;
	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_states_state__US")
	public List<WebElement> countryList;
	
	
	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_postal")
	public WebElement zipcode;
	
	@FindBy(id = "dwfrm_singleshipping_shippingAddress_addressFields_phone")
	public WebElement phoneNo;
	
	@FindBy(xpath = "//button[@value='NEXT STEP: PAYMENT INFO']")
	public WebElement nextButton;
	
	@FindBy(xpath = "//a[text()='USE SUGGESTED ADDRESS']")
	public WebElement addressverificationpopup;
	
	public void SignIn_Checkout() throws InterruptedException {
		 Thread.sleep(5000);
		 emailID.sendKeys("adi2510@yopmail.com");
		 emailID.sendKeys(Keys.ENTER);
		 password.sendKeys("Sapient@123");
		 signIn.click();
	}
	
	public void enterShippingAddress() throws InterruptedException {
		firstName.clear();
		firstName.sendKeys("Ad");
		
		lastName.clear();
		lastName.sendKeys("Raj"); 
		
		AddressLine1.clear();
		AddressLine1.sendKeys("301 W 2nd Street"); 
		
		city.clear();
		city.sendKeys("Austin");  
		
		for(WebElement country : countryList){
			 if(country.getText().equals("Texas")) {
			 country.click(); 
			 Thread.sleep(3000);
			 break;
			 } 
			 }
		
		zipcode.clear();
		 zipcode.sendKeys("78701");
		 
		 phoneNo.clear();
		 phoneNo.sendKeys("22222222");
		
		 Thread.sleep(4000);
		 nextButton.click();
		 Thread.sleep(10000);
		                
		 addressverificationpopup.click();
	}
}
