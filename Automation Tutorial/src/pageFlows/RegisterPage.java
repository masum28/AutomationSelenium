package pageFlows;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import data.Constants;
import data.TestDataPool;
import infrastructure.Operations;
import pageObjects.RegisterObj;
import utils.ExcelUtils;

public class RegisterPage {

	static Operations op = new Operations();	
	
	public static void registrationDetails(WebDriver driver) throws Exception {
		
		
	//HashMap<String,String> tcData =	ExcelUtils.getTestDataXls(Constants.DATAPOOL_PATH, "DemoAut", 0, 1);
		
	//driver.findElement(By.xpath(RegisterPageObj.textbox_FirstName))
		
		
		
	op.setText(driver, RegisterObj.textbox_FirstName, TestDataPool.tcData.get("firstName1"));	//Parameterize
		
	//op.setText(driver, RegisterObj.textbox_LastName, "Automation"); //this is call hardcodd
	
	op.setText(driver, RegisterObj.textbox_LastName, TestDataPool.tcData.get("lastName1"));
	
	op.setText(driver, RegisterObj.textbox_Phone, TestDataPool.tcData.get("phone"));
	op.setText(driver, RegisterObj.textbox_Email, TestDataPool.tcData.get("email"));
	op.setText(driver, RegisterObj.textbox_Address, TestDataPool.tcData.get("address1"));
	op.setText(driver, RegisterObj.textbox_City, TestDataPool.tcData.get("city"));
	op.setText(driver, RegisterObj.textbox_State, TestDataPool.tcData.get("state"));
	op.setText(driver, RegisterObj.testbox_PostalCode, TestDataPool.tcData.get("postalcode"));
	
	
	/*WebElement ele = driver.findElement(By.xpath(RegisterPageObj.Dropdow_Country));
	Select sel = new Select(ele);
	sel.selectByVisibleText("UNITED STATES");*/
	
	
	op.selectDropdown(driver, RegisterObj.Dropdow_Country, "UNITED STATES");
	
	op.setText(driver, RegisterObj.textbox_Username, "automationuser");
	
	op.setText(driver, RegisterObj.textbox_Password, "automationpass");
	op.setText(driver, RegisterObj.textbox_ConfirmPassword, "automationpass");
	op.implicitWait(driver, 20);
	op.clickLink(driver, RegisterObj.Link_Submit);
	
	op.implicitWait(driver, 20);
	}
}
