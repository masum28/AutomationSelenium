package pageFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.RegisterConfirmObj;

public class RegisterConfirmPage {

	Operations op = new Operations();

	public void registerConfirm_Dear(WebDriver driver) {

		//String CapturedValue = driver.findElement(By.xpath(RegisterConfirmPageObj.textDearFnLn)).getText();	

		// return CapturedValue;
		String ActualValue_RegConfDear = op.getText(driver, RegisterConfirmObj.textDearFnLn);
		String expectedValue_RegConfDear = "Dear Sangam Y,";

		// validation
		if(expectedValue_RegConfDear.equals(ActualValue_RegConfDear))

			System.out.println("Pass - Dear Sangam Y");

		else
			System.out.println("Fail - Dear Sangam Y");
	}


	public void registerConfirm_Note(WebDriver driver) {


		//String  actualValue_Note = driver.findElement(By.xpath(RegisterConfirmPageObj.text_Note)).getText();


		String  actualValue_Note = op.getText(driver, RegisterConfirmObj.text_Note);
		String expectedValue_Note = "Note: Your user name is automationuser.";

		if(expectedValue_Note.equals(actualValue_Note))

			System.out.println("Pass - Note conformation " + actualValue_Note);
		else 
			System.out.println("Fail - Note conformation" + actualValue_Note + "is not same as "+expectedValue_Note);


		op.implicitWait(driver, 20);






	} 


}
