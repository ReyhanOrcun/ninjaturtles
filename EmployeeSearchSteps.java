package com.neotech.steps;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {

	/*@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		// Write code here that turns the phrase above into concrete actions
		//setUp();  this is done by the hooks

		sendText(login.username, ConfigsReader.getProperty("username"));

		sendText(login.password, ConfigsReader.getProperty("password"));

		click(login.logInButton);

	}*/

	@Given("user navigates to the employee list page")
	public void user_navigates_to_the_employee_list_page() {

		click(dashboard.PIM);
		click(dashboard.employeeListLink);

	}
	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		sendText(employeeList.searchBox, "1007");
	}

	@When("user enters valid employee first and last name")
	public void user_enters_valid_employee_first_and_last_name() {
		sendText(employeeList.searchBox, "Alice Duval");
	}


	@When("clicks on search button")
	public void clicks_on_search_button() {
		click(employeeList.searchIcon);
	}

	@Then("employee information is displayed")
	public void employee_information_is_displayed() {

		System.out.println("Employee is displayed");
		
		wait(5);
		
		// This is done by the Hooks
				//tearDown();
		
	}

}
