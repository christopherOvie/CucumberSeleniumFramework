package utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtillity {
	
	public WebDriver driver;
	
	public GenericUtillity(WebDriver driver) {
		this.driver=driver;
	}
	public void switchWindowToChild() {
		Set<String> s1=  driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		String parentWindowID=it.next();
		String childWindowID=it.next();
		driver.switchTo().window(childWindowID);
	}

}
