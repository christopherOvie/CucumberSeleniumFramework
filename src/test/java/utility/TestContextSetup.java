package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


import pages.PageObjectManager;

public class TestContextSetup {
	
	public  WebDriver driver;
	public String landingPageproductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtillity genericUtillity;

	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webdriverManager());//already in textcontext  why semnd texcontextdriver only send driver
		genericUtillity = new GenericUtillity(testBase.webdriverManager());
	}
}

//WebdriverManage gives driver ..>>PageObjectManager>>>pages ObjectFiles