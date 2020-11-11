package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.PLP_Page;

public class PLPPageSteps {
	TestContext testContext;
	 PLP_Page pLPPage;
	 WebDriver driver;
	
	 PageObjectManager pageObjectManager; 
	 WebDriverManager webDriverManager;
	
	 
	 public PLPPageSteps(TestContext context) {
	 testContext = context;
	 pLPPage = testContext.getPageObjectManager().getPLPPage();
	 }
	 
	 @Given("^user is on Home Page$")
		public void user_is_on_Home_Page() throws IOException {
		 webDriverManager = new WebDriverManager();
		 driver = webDriverManager.getDriver();
		 pageObjectManager = new PageObjectManager(driver);
		 
		pLPPage= pageObjectManager.getPLPPage();
	pLPPage.navigateTo_HomePage();
//			webDriverManager = new WebDriverManager();
//			driver = webDriverManager.getDriver();
//			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		}

		@When("^he search for \"([^\"]*)\"$")
		public void he_search_for(String search) throws Throwable {
			pLPPage.perform_Search(search);
//			driver.navigate().to(
//					"https://dev17-ncsastore-mcmworldwide.demandware.net/s/MCM-US/en_US/search?q=" + arg1 + "&lang=en_US");
		}
	 
	 @When("^choose to buy the first item$")
		public void choose_to_buy_the_first_item() throws Throwable {
			Thread.sleep(2000);
			
			pLPPage.handlePopUp();
			Thread.sleep(3000);
			pLPPage.clickFirstProduct();

		}
}
