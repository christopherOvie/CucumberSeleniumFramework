package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
//responsible to create the object
	public  LandingPage landingPage;
	public  OfferPage offerPage;
	public CheckoutPage checkoutPage;
	public WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage getOfferPage() {
		offerPage = new OfferPage(driver);
		return offerPage;
	}
	
	
	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
}
//testContextSetup.testBase.webdriverManager()   this is my driver