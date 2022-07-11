package com.neotech.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	
	@When("Login with {string} and {string}")
	public void login_with_and(String username, String password) {
	   System.out.println("Login with: "+ username + " "+ password);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
	   System.out.println("click the login button");
	}
	
	@Then("I validate Welcome {string} is displayed")
	public void i_validate_welcome_is_displayed(String fullname) {
	    System.out.println("validate: welcome "+ fullname);
	}

	@Then("We want to say Bye {string}")
	public void we_want_to_say_bye(String fullname) {
		System.out.println("validate: Bye "+ fullname);
	}


}
