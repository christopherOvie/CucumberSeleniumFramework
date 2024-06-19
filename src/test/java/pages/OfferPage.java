package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.TestContextSetup;

public class OfferPage {
	
	
	public  WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
 
	private By search = By.xpath("//input[@type='search']");
  
	private  By productName  =    By.cssSelector("tr td:nth-child(1)");
    
    public void searchItem(String  name ) {
    	driver.findElement(search).sendKeys(name);
    }
    
    public String getProductName() {
    	return driver.findElement(search).getText();
    }
}
