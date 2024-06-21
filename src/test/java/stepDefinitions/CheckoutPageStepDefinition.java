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
import pages.CheckoutPage;
import pages.LandingPage;
import utility.TestContextSetup;

public class CheckoutPageStepDefinition {
	public  WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;
	//singgle responsibility principle
	//loosely coupled
	//factory designed pattern
	
	

	public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
	this.checkoutPage=	testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	
	@Then("User proceeds to Checkout and validate the {string} items in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) throws InterruptedException {
		checkoutPage.checkoutItems();
		Thread.sleep(3000);
		 
	}

	@Then("verify user has ability to enter code and place the order")
	public void verify_user_has_ability_to_enter_code_and_place_the_order() {
		 ;
		 Assert.assertTrue(checkoutPage.verifypromoBtn());
		 Assert.assertTrue(checkoutPage.verifyplaceOrder());
	}

	//testContextSetup.testBase.webdriverManager()   this is my driver





}
