package pageFlows;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import data.Constants;
import data.TestDataPool;
import infrastructure.Operations;
import pageObjects.BookAFlightObj;
import utils.ExcelUtils;
import utils.ReportingUtils;

public class BookAFlightPage {
	
	
	Operations op = new Operations();


	public void summary(WebDriver driver) {
		
		System.out.println("\n ############  BookAFlightPage -Passenger #################### \n");
		
	//String departPrice = driver.findElement(By.xpath(BookAFlightObj.table_DepartPrice)).getText();
	
		String departPrice = op.getText(driver, BookAFlightObj.table_DepartPrice);
		
		String returnPrice = op.getText(driver, BookAFlightObj.table_ReturnPrice);
		String NoOfPassengers = op.getText(driver, BookAFlightObj.table_NoOfPassengers);
		String taxes = op.getText(driver, BookAFlightObj.table_taxes);
		String totalPrice = op.getText(driver, BookAFlightObj.table_TotalPrice);
		
		taxes = taxes.substring(1); //$96
		
		System.out.println("Modified Tax ="+ taxes);
		
		totalPrice = totalPrice.replaceAll("[$]", "");
		// Parsing
		
	int departPriceInt = Integer.parseInt(departPrice);
	int returnPriceInt	= Integer.parseInt(returnPrice);
	int NoOfPassengersInt = Integer.parseInt(NoOfPassengers);
	
	
	
	int taxesInt = Integer.parseInt(taxes);
	
	int totalPriceInt = Integer.parseInt(totalPrice);
	
	System.out.println("Modified totalPrice ="+ totalPrice);
	
	// double taxDouble = Double.parseDouble(taxes);
	
	//long totalPriceLong = Long.parseLong(TotalPrice);
	
	//Validation
	// totalprice = (departPrice+returnPrice)* totalnoofpassengers + taxes
	
	int expectedTotalPrice = (departPriceInt+returnPriceInt)*NoOfPassengersInt + taxesInt ;
	int actualTotalPrice = totalPriceInt;
	
	
	ReportingUtils.reportResult("Total Flight Price", expectedTotalPrice, actualTotalPrice);
	
	/* if(expectedTotalPrice == actualTotalPrice)
		 
		 System.out.println("Pass - expectedTotalPrice == actualTotalPrice");
		 else
			 System.out.println("Fail - expectedTotalPrice NOT equal to  actualTotalPrice");
	 
	 */
	}	
 public void passengers(WebDriver driver) throws Exception{
	
	//HashMap<String,String> tcdata = ExcelUtils.getTestDataXls(Constants.DATAPOOL_PATH, "DemoAut", 0, 1);
	op.setText(driver, BookAFlightObj.textbox_firstName1, TestDataPool.tcData.get("firstName1"));
	op.setText(driver, BookAFlightObj.textbox_lastName1, TestDataPool.tcData.get("lastName1"));
	op.selectDropdown(driver, BookAFlightObj.dropdown_meal1, TestDataPool.tcData.get("meal"));
	op.setText(driver, BookAFlightObj.textbox_firstName2, TestDataPool.tcData.get("firstName2"));
	op.setText(driver, BookAFlightObj.textbox_lastName2, TestDataPool.tcData.get("lastName2"));
	op.selectDropdown(driver, BookAFlightObj.dropdown_meal2, TestDataPool.tcData.get("meal"));
	
}
 
 public void creditcard(WebDriver driver) {
	 op.selectDropdown(driver, BookAFlightObj.dropdown_CreditCardType, TestDataPool.tcData.get("creditCardType"));
	 op.setText(driver, BookAFlightObj.textbox_CreditCardNumber, TestDataPool.tcData.get("creditCardNumber"));
	 
	String creditCardExp = TestDataPool.tcData.get("creditCardExpiry");
	
	String[] cc= creditCardExp.split("[-]");
	 
	 op.selectDropdown(driver, BookAFlightObj.dropdown_CreditCardExpMonth, cc[0]);
	 
	 op.selectDropdown(driver, BookAFlightObj.dropdown_CreditCardExpYear, cc[1]);	
	 op.setText(driver, BookAFlightObj.textbox_CreditCardFirstName1, TestDataPool.tcData.get("firstName1"));
	 op.setText(driver, BookAFlightObj.textbox_CreditCardLastName1, TestDataPool.tcData.get("lastName1"));
	 op.clickCheckbox(driver, BookAFlightObj.checkbox_TicketlessTravel, TestDataPool.tcData.get("ticketlessTravel"));
	 op.clickLink(driver, BookAFlightObj.button_SecurePurchase);
	 
 }
	}

