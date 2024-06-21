package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By cartBag = By.cssSelector("[alt='Cart']");
	private  By checkoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	private By promoBtn = By.cssSelector(".promoBtn");
	private  By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
    
    public void checkoutItems() {
    	driver.findElement(cartBag).click();
    	driver.findElement(checkoutButton).click();
    }

    public boolean verifypromoBtn() {
    	driver.findElement(promoBtn).isDisplayed();
    	return true;
    }
    
    public boolean verifyplaceOrder() {
    	driver.findElement(placeOrder).isDisplayed();
    	return true;
    }
}


//testContextSetup.testBase.webdriverManager()   this is my driver