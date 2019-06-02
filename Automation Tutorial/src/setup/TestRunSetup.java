package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.Constants;

public class TestRunSetup {
	
	
	public static WebDriver launch(String browsertype, String url) {
		// exaple int x = 0;
		WebDriver driver = null;
		switch (browsertype) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
			
			 driver = new ChromeDriver();
			// x= 2;
			//"http://www.demoaut.com"
			
			break;
			
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Selenium Driver\\geckodriver.exe");
			
			// driver = new FirefoxDriver();
			
							
			
			break;
		default:
			break;
		}
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		return driver;

}}
