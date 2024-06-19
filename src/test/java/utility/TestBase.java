package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	
	

	public WebDriver webdriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
	String url=	prop.getProperty("QAurl");
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				 driver = new ChromeDriver();	
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			else if(prop.getProperty("browser")=="firefox") {
				driver = new FirefoxDriver();
			}
		
		 
	    driver.get(url);
	}
	    return driver;
	
	}

}
