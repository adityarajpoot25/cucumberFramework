package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Review_Page {

	public Review_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[text()='COMPLETE PURCHASE']")
	public WebElement completePurchase;
	
	public void ReviewcompletePurchase() {
		completePurchase.click();
	
	}
}
