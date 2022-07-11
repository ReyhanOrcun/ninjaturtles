package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	@Given("I navigated to Google")

	public void i_navigated_to_google() {

		System.out.println(" Opening google website");
	}

	@When("I type something to the search field")
	public void i_type_something_to_the_search_field() {
		System.out.println(" search for puppies ");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I need to click to search button")
	public void i_need_to_click_to_search_button() {

		System.out.println("click on search ");
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I can see the results of my  search")
	public void i_can_see_the_results_of_my_search1() {
		System.out.println(" validate if results are showing");

		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I count the number of the results shown")
	public void i_count_the_number_of_the_results_shown() {
		System.out.println(" Count the number of results");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I say what I want to search")
	public void i_say_what_i_want_to_search1() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("I can see the results of my search")
	public void i_see_the_results_of_my_search() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("I can count the number of the results")
	public void i_can_count_the_number_of_the_results1() {
		// Write code here that turns the phrase above into concrete actions
		
	}
	
	

	

	




}
