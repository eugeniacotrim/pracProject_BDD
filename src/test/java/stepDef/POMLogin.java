package stepDef;

import org.openqa.selenium.WebDriver;

import utils.LibDriver;

public class POMLogin {

	WebDriver driver;
	LibDriver libDriver = new LibDriver();

	public void LoginMethod(String username, String password) {

		this.driver = libDriver.getDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(POMRepo.UN).sendKeys(username);
		driver.findElement(POMRepo.PWD).sendKeys(password);
		driver.findElement(POMRepo.submit).click();

	}
}

//public class POMLogin extends LibDriver {
//
//	WebDriver driver;
////	LibDriver libDriver = new LibDriver();
////instead of creating a new instance of the LibDriver class, 
////the class POMLogin EXTENDS LibDriver, so that any and all
////of its methods can be called directly
//
//	public void LoginMethod(String username, String password) {
//
//		this.driver = LibDriver.driver;
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(POMRepo.UN).sendKeys(username);
//		driver.findElement(POMRepo.PWD).sendKeys(password);
//		driver.findElement(POMRepo.submit).click();
//
//	}
//}