package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Products_Page {
	
	WebDriver driver;
	
	public Products_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	//By sortButton = By.xpath("//select[@data-test='product-sort-container']");
	//By onesieAddToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	
	
	//public void productsSortFilter() {
		//driver.findElement(sortButton).click();
	//}
	
	//public void addItemToCart() {
		//driver.findElement(onesieAddToCartButton).click();
	//}
}
