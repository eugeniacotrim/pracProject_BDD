package stepDef;

import org.openqa.selenium.By;

public class POMRepo {

	public static final By UN = By.id("user-name");
	public static final By PWD = By.id("password");
	public static final By submit = By.id("login-button");

	public static final By selectTshirt = By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");

	public static final By button_addToCart = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	public static final By goToCart = By.xpath("//a[@class='shopping_cart_link']");

	public static final By verifyProductInCart = By.xpath("//div[contains(text(),'QTY')]");

}