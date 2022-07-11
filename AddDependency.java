package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDependency extends CommonMethods {

	@And("Admin navigates to Personal Details Page")
	public void admin_navigates_to_personal_details_page() {
		click(dashboard.PIM);
		click(dashboard.employeeListLink);
		sendText(employeeList.searchBox, "1007");

		click(employeeList.searchIcon);
		click(employeeList.employeeIMG);
	}

	@When("User clicks more")
	public void user_clicks_more() {

		click(personalDetails.more);

		wait(3);

	}

	@When("User Selects Dependents from drop down options")
	public void user_selects_dependents_from_drop_down_options() {
		click(personalDetails.dependents);

	}

	@Then("user should see Assigned Dependents page")
	public void user_should_see_assigned_dependents_page() {

		String expected = "Assigned Dependents";
		String actual = addDependents.assignedDependents.getText();

		Assert.assertEquals("The name does not match", expected, actual);
		System.out.println("actual name is" + actual);
	}

	@Given("Navigate ADD DEPENDENT Frame")
	public void navigate_add_dependent_frame() {

		click(addDependents.addBtn);

		String expected = "Add Dependent";
		String actual = addDependents.addDependentsFrame.getText();

		Assert.assertEquals("The name does not match", expected, actual);
		System.out.println("Add Dependents frame -->>>  " + actual);

	}

	@When("user enter name {string}")
	public void user_enter_name(String Name) {

		sendText(addDependents.name, Name);

	}

	@When("user selects Date of Birth {string}")
	public void user_selects(String DOB) {

		sendText(addDependents.DOB, DOB);

	}

	@When("user selects Relationship {string} from dropdown")
	public void user_selects_from_dropdown(String relationship) {

		click(addDependents.relationship);

		

		List<WebElement> list = addDependents.relationshipOptions;
		for (WebElement option : list) {

			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase(relationship)) {
				click(option);
				break;
			} else {
				driver.findElement(By.xpath("//*[@id='bs-select-1-2']")).click();

				sendText(addDependents.specify, relationship);

			}

		}
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {

		click(addDependents.saveBtn);

	}

	@Then("Validate that user is  able to see {string} message")
	public void i_am_able_to_see_message(String string) {

	}
@When("User enters Certificate No {string}")
	public void user_enters_certificate_no(String CertificateNo) {
	   
		//click(addDependents.certificateNo);
		
		sendText(addDependents.certificateNo,  CertificateNo );
		
		wait(2);
		
	}
	@When("User enters Date of registration {string}")
	public void user_enters_date_of_registration(String RegistrationDate) {
		
		//click(addDependents.registrationDateField);
		sendText(addDependents.registrationDateField, RegistrationDate );
		
		wait(2);
	   
	}
	@When("User enters SAVE button")
	public void user_enters_save_button() {
		
		click(addDependents.saveMarriageInfo);
	    
	}
	@Then("Admin gets {string} message")
	public void admin_gets_message(String string) {
	    
	}
	

}
