package stepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import utils.LibDriver;

public class POMCart extends LibDriver {

	WebDriver driver;

	public void CartMethod1() {

		this.driver = LibDriver.driver;

		driver.findElement(POMRepo.selectTshirt).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(POMRepo.button_addToCart).click();
	}

	public void CartMethod2() {
		driver.findElement(POMRepo.goToCart).click();
	}

}
