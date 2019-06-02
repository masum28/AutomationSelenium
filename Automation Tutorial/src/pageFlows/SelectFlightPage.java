package pageFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.SelectFlightObj;

public class SelectFlightPage {
	
	Operations op = new Operations();

	public void departReturnFlight(WebDriver driver) {
	
		// This is the common way to put the xpath
	//driver.findElement(By.xpath(SelectFlightObj.radiobutton_DepartUnifiedAirlines)).click();	

		// Depart Flight
op.clickRadiobutton(driver, SelectFlightObj.radiobutton_DepartUnifiedAirlines);

// Return Flight

op.clickRadiobutton(driver, SelectFlightObj.radiobutton_ReturnUnifiedAirlines);


//Continue
new Operations().clickLink(driver, SelectFlightObj.button_Continue);
	}
	
	
}
