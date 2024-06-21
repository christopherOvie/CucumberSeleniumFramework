package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private  By productName= By.cssSelector("h4.product-name");
	private  By topDeals= By.linkText("Top Deals");
	private  By increment= By.cssSelector("a.increment");
	private  By addToCart= By.cssSelector("div.product-action button");
	private int quantity;
    
    public void searchProduct(String  name ) {
    	driver.findElement(search).sendKeys(name);
    }
    public void getSearchText() {
    	driver.findElement(search).getText();
    }
    
    public String getProductName() {
    	return driver.findElement(productName).getText();
    }
    
    public void selectTopDeals() {
    	driver.findElement(topDeals).click();
    }

    public String getPageTitle() {
    return	driver.getTitle();
    }
    
   public void incrementQuantity(int quantity) {
	   int i = quantity-1;
	   while(i>0) {
		   driver.findElement(increment).click();
		   i--;
		   
	   }
   }
   public void incrementQu(int incrementBy) {
       for (int i = 0; i < incrementBy; i++) {
           // Increment the quantity field
           quantity++;
       }
   }
    public void addToCart() {
    	driver.findElement(addToCart).click();
    }
}
