package pageFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.FlightFinderObj;

public class FlightFinderPage {
	
	Operations op = new Operations();

	public void clickFlights(WebDriver driver) {
		
	op.clickLink(driver, FlightFinderObj.link_Flight);	
	}
	// Calling the function by creating this 
	public void flightDetalis(WebDriver driver) {
		
	boolean flag =	driver.findElement(By.xpath(FlightFinderObj.radiobutton_Roundtrip)).isSelected();
	if(!flag)
		op.implicitWait(driver, 20);
		op.clickRadiobutton(driver, FlightFinderObj.radiobutton_Roundtrip);
		op.selectDropdown(driver, FlightFinderObj.dropdown_Passengers, "2");
		op.selectDropdown(driver, FlightFinderObj.dropdown_DepartingFrom, "New York");
		op.selectDropdown(driver, FlightFinderObj.dropdown_DepartingOnMonth, "March");
		op.selectDropdown(driver, FlightFinderObj.dropdown_DepartingOnDate, "20");
		op.selectDropdown(driver, FlightFinderObj.dropdown_ArrivingIn, "Paris");
		op.selectDropdown(driver, FlightFinderObj.dropdown_ReturningOnMonth, "April");
		op.selectDropdown(driver, FlightFinderObj.dropdown_ReturningOnDate, "24");
		op.implicitWait(driver, 20);
	}
	
	public void preferences(WebDriver driver) {
		
		op.clickRadiobutton(driver, FlightFinderObj.radiobutton_FirstClass);
	}
	
	public void continueButton(WebDriver driver) {
		
		op.clickLink(driver, FlightFinderObj.button_Continue);
		
		op.implicitWait(driver, 20);
	}
}
