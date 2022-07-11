package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {

	@Given("Precondition1     #backround will run before every scenarios")
	public void precondition1_backround_will_run_before_every_scenarios() {
		System.out.println("running precondition 1 ");
	}

	@Given("Precondition2")
	public void precondition2() {
		System.out.println("running precondition 2 ");
	}

	@When("Test number1   firstname is {string} and lastname is {string}")
	public void test_number1_firstname_is_and_lastname_is(String string, String string2) {
	   System.out.println("Running test1  firstname is:" + string + "lastname is:"+  string2);
	}

	@When("Test number2")
	public void test_number2() {
		System.out.println("Running test 2");
	};

	@When("Test number3     age is {int}")
	public void test_number3_age_is(Integer int1) {
	   System.out.println("running test3 with integer " + int1);
	}


	@Then("Validation number1")
	public void validation_number1() {
		System.out.println("Running Validation 1");
	}

	@Then("Validation number2")
	public void validation_number2() {
		System.out.println("Running Validation 2");
	}
	
	@When("Test number4")
	public void test_number4() {
		System.out.println("Running test 4");
	}
	@When("Test number5")
	public void test_number5() {
		System.out.println("Running test 5");
	}
	@When("Test number6")
	public void test_number6() {
		System.out.println("Running test 6");
	}
	@Then("Validation number3")
	public void validation_number3() {
		System.out.println("Running Validation 3");
	}
	@Then("Validation number4")
	public void validation_number4() {
		System.out.println("Running Validation 4");
	}

}
