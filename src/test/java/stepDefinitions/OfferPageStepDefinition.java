package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.LandingPage;
import pages.OfferPage;
import pages.PageObjectManager;
import utility.TestContextSetup;

public class OfferPageStepDefinition {
	
	public  WebDriver driver;
	//public String landingPageproductName;
    public String offerPageProductName;
	public TestContextSetup testContextSetup;
	public PageObjectManager pageObjectManager;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	public void switchToOfferPage() {
		//testContextSetup. driver.findElement(By.linkText("Top Deals")).click();
		
		//pageObjectManager= new PageObjectManager(testContextSetup.driver);
		
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		//LandingPage landingPage = new LandingPage(testContextSetup. driver); //landing page do not know driver to use
		landingPage.selectTopDeals();
		testContextSetup.genericUtillity.switchWindowToChild();
//		Set<String> s1=  testContextSetup.driver.getWindowHandles();
//		Iterator<String> it = s1.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		testContextSetup.driver.switchTo().window(childWindowID);
	}
	
	
	@Then("user search for {string} shortname in offers page")
	public void user_search_for_shortname_in_offers_page(String shortName) throws InterruptedException {
		switchToOfferPage();
		
		//OfferPage offerpage= new OfferPage(testContextSetup. driver);
		OfferPage offerpage= testContextSetup.pageObjectManager.getOfferPage();
		offerpage.searchItem(shortName);
		
		//testContextSetup. driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		
		offerPageProductName  = offerpage.getProductName();
		
		 Thread.sleep(2000);
		//String offerPageProductName= testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		//System.out.println(offerPageProductName);
	 ;
	}
		@Then("validate product name in offers page matches with landing page")
		public void validate_product_name_in_offers_page_matches_with_landing_page() {
			  Assert.assertEquals(offerPageProductName, testContextSetup.landingPageproductName);
		}

}
