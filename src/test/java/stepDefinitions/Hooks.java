package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		
	}
	@After
	public void afterScenario() throws IOException {
		testContextSetup.testBase.webdriverManager().quit();
		//testContextSetup.testBase.webdriverManager()   this is my driver
	}
	@AfterStep
	public void addScreenShots(Scenario sc) throws IOException {
		if(sc.isFailed()) {
		System.out.println("am here");
		
		WebDriver driver= testContextSetup.testBase.webdriverManager();
		//((TakesScreenshot))driver
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent=FileUtils.readFileToByteArray(screenshot);
		sc.attach(fileContent, "image/PNG", "image");

	}
	}
//all failure are not genuine failur e some are network issues so we rerun only failed testcases
	//many manually rerubn fail
}
