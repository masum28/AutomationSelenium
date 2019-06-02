package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.Constants;
import data.TestDataPool;
import pageFlows.BookAFlightPage;
import pageFlows.FlightFinderPage;
import pageFlows.HomePage;
import pageFlows.RegisterConfirmPage;
import pageFlows.RegisterPage;
import pageFlows.SelectFlightPage;
import setup.TestRunSetup;

public class DemoAutTest_ModularizerdFramework {

	public static void main(String[] args) {
	System.out.println("###############  Test Case Starts -DemoAutTest_ModularizedFramework ###############");
		//Global variables

		try {
			String browser = Constants.BROWSER_TYPE;
			String url = Constants.BASE_URL;
			
			//setup
			new TestDataPool(1);
			
			// call reusable function

			WebDriver driver = TestRunSetup.launch(browser, url);
			
			//Page Flow
			// Register Click		
			new HomePage().registration(driver);

			//Filling in the Registration details
			RegisterPage.registrationDetails(driver);

			//Confirmation Validation

			new RegisterConfirmPage().registerConfirm_Dear(driver);
			// Capture and validation
			
			new RegisterConfirmPage().registerConfirm_Note(driver);

			// Flight Finder

			new FlightFinderPage().clickFlights(driver);

			//Flight Reservation

			new FlightFinderPage().flightDetalis(driver);
			new FlightFinderPage().continueButton(driver);
			
			// Select Flight
			
			new SelectFlightPage().departReturnFlight(driver);
			
			// Book a Flight
			
			new BookAFlightPage().summary(driver);
			
			new BookAFlightPage().passengers(driver);
			
			new BookAFlightPage().creditcard(driver);
			
			
			// Validation

			// Signout
			System.out.println("###############  Test Case Ends -DemoAutTest_ModularizedFramework ###############");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw e; //it will stop the execution
		}
		finally {
			//driver.close();	
		}
		

	}

}
