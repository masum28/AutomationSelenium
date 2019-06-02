package pageFlows;



import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.HomeObj;

public class HomePage {

	static Operations op = new Operations();
	
	public static void registration(WebDriver driver) {
		
		op.clickLink(driver, HomeObj.link_Register);
		
		op.implicitWait(driver, 20);
		
	}
	
	
}
