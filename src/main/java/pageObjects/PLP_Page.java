package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class PLP_Page {
	WebDriver driver;
	PLP_Page pLPPage;
	PageObjectManager pageObjectManager; 
	 WebDriverManager webDriverManager;
	 ConfigFileReader configFileReader;
	public PLP_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();

	}

	@FindBy(xpath=("(//button[@class='js-modal-close'])[9]"))
	public WebElement Popup;
	
	@FindBy(css = "div.grid-cell:first-child")
	public WebElement firstProduct;
	 
	public void handlePopUp() {
		System.out.println("Before Click");
		Popup.click();
		System.out.println("After Click");
	}
	
	public void clickFirstProduct() {
		firstProduct.click();
	}
	
	public void navigateTo_HomePage() {
		driver.get(configFileReader.getApplicationUrl());
		 }
	
	public void perform_Search(String search) {
		driver.navigate().to(
				"https://dev17-ncsastore-mcmworldwide.demandware.net/s/MCM-US/en_US/search?q=" + search + "&lang=en_US");
		 }
	
	
}
