package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucTagStepdef {
	@Given("Amy launched chrome browser")
	public void amy_launched_chrome_browser() {
	    System.out.println("Amy launched browser");
	}

	@Given("provided valid URL")
	public void provided_valid_URL() {
	    System.out.println("provided valid url");
	}

	@When("Amy provides valid credentials")
	public void amy_provides_valid_credentials() {
	    System.out.println("amy provide valid credentials");
	}

	@When("click on login")
	public void click_on_login() {
	   System.out.println("click on login");
	}

	@Then("Amy shall see the home page")
	public void amy_shall_see_the_home_page() {
	    System.out.println("amy shall be see the home page");
	}

	@Given("Amy is on home page")
	public void amy_is_on_home_page() {
	    System.out.println("amy is on home page");
	}

	@When("Amy searches for a product")
	public void amy_searches_for_a_product() {
	    System.out.println("amy searches for a product");
	}

	@Then("she shall see list of products displayed")
	public void she_shall_see_list_of_products_displayed() {
	    System.out.println("she shall see list of product displayed");
	}

	@Given("Amy is on registration page")
	public void amy_is_on_registration_page() {
	    System.out.println("amy is on registration page");
	}

	@When("Amy provides all the details")
	public void amy_provides_all_the_details() {
	    System.out.println("amy provideds all the details");
	}

	@Then("she shall be registered successfully")
	public void she_shall_be_registered_successfully() {
	    System.out.println("she shall be registered successfully");
	}
}
