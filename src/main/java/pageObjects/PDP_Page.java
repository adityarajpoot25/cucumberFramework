package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.WebDriverManager;

public class PDP_Page extends WebDriverManager{
	
	public PDP_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	public WebElement AddToCart;
	
	@FindBy(xpath = "//a[@title='View Bags']")
	public WebElement Minicart;
	
	
	public void addToCart() throws AWTException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", AddToCart);

		
		
		System.out.println("Product is added to cart");
	}
	
	public void viewBag() {
		Minicart.click();
	}
	
}
