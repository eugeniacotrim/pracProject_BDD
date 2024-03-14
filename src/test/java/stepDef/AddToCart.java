package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {

	POMLogin pomLogin = new POMLogin();
	POMCart pomcart = new POMCart();
	POMCheckout pomcheckout = new POMCheckout();

	@Given("Login by entering {string} and {string}")
	public void login_by_entering_and(String username, String password) {
		pomLogin.LoginMethod(username, password);
	}

	@When("User chooses the product and clicks on Add to cart")
	public void user_chooses_the_product_and_clicks_on_add_to_cart() {
		pomcart.CartMethod1();
	}

	@When("User clicks on Cart link")
	public void user_clicks_on_cart_link() {
		pomcart.CartMethod2();
	}

	@Then("Product is added to Cart")
	public void product_is_added_to_cart() {
		pomcheckout.CheckoutMethod();
	}

}