package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LibDriver;

public class POMCheckout {

	WebDriver driver;

	public void CheckoutMethod() {
		this.driver = LibDriver.driver;

		WebElement verify = driver.findElement(POMRepo.verifyProductInCart);

		if (verify != null) {
			System.out.println("List of products in cart has loaded");
		}
	}
		
	public void closeApp() {
		driver.close();
	}

}
