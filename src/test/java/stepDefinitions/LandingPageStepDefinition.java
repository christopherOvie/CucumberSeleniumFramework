package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import utility.TestContextSetup;

public class LandingPageStepDefinition {
	public  WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	//singgle responsibility principle
	//loosely coupled
	//factory designed pattern
	
	

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
	}
	
	
	@Given("User is on Greencart landing page")
	public void user_is_on_greencart_landing_page() {
	
		//testContextSetup. driver = new ChromeDriver();
		//testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("User search with shortened name {string} and extract actual name of product")
	public void user_search_with_shortened_name_and_extract_actual_name_of_product(String shortName) throws InterruptedException {
		
		//LandingPage landingPage = new LandingPage(testContextSetup.driver);
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		//give user defined information
		landingPage.searchProduct(shortName);
		Thread.sleep(2000);
		landingPage.getProductName().split("-")[0].trim();
		
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
//	  landingPageproductName= testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
//		System.out.println(landingPageproductName +" is extracted from product");
//		Reporter.log(shortName);
//		Thread.sleep(2000);
	}

	



}
