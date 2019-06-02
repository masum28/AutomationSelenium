package infrastructure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Operations {

	// Clicking the link button
	public void clickLink(WebDriver driver, String xpathExpression) {
		
		try {
			driver.findElement(By.xpath(xpathExpression)).click();
			System.out.println("Click the link - "+ xpathExpression);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
		// Typing the input value
	public void setText(WebDriver driver, String xpathExpression, String inputValue) {
		driver.findElement(By.xpath(xpathExpression)).clear();	
		driver.findElement(By.xpath(xpathExpression)).sendKeys(inputValue);
		System.out.println("setText - "+ xpathExpression +" - " +inputValue);	
		
	}
	//Select a value from drowpdown
		
		public void selectDropdown(WebDriver driver, String xpathExpressino, String inputValue) {
			
			WebElement ele = driver.findElement(By.xpath(xpathExpressino));
			
			Select sel = new Select(ele);
			sel.selectByVisibleText(inputValue);
			System.out.println("selectDropdown - "+ xpathExpressino +" - " +inputValue);
		}
		
	// Get text from page
		
		public String getText(WebDriver driver, String xpathExpressino) {
			
		String value = driver.findElement(By.xpath(xpathExpressino)).getText();
		
		System.out.println("getText - "+ xpathExpressino +" - " +value);
		return value;
			
		}
		
		// Clicking on Radio button
		
		public void clickRadiobutton(WebDriver driver, String xpathExpression) {
		
			driver.findElement(By.xpath(xpathExpression)).click();
			System.out.println("clickRadiobutton - "+ xpathExpression);	
			
		}
		
		//Check the CheckBox
		public void clickCheckbox(WebDriver driver, String xpathExpression, String inputvalue) {
			//driver.findElement(By.xpath(xpathExpression)).isSelected();
			
			if(inputvalue.equalsIgnoreCase("Yes"));		
					
			driver.findElement(By.xpath(xpathExpression)).click();
			System.out.println("clickCheckbox - "+ xpathExpression);	
		}
		//Implicit wait time
		
		public void implicitWait (WebDriver driver, long maxTimeout) {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			System.out.println("implicitWait - waited for "+ maxTimeout+" second");	
		}
		
		
		
}
