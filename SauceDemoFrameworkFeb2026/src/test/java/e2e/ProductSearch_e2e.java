package e2e;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.Constants;

public class ProductSearch_e2e {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = library.Browsers.launchBrowser("Chrome");
		driver.get(Constants.URL);
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	
	@Test
	public void Filter_Search_Result_By_Price() {
		
	}
	
}
