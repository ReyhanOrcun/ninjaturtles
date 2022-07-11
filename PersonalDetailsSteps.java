package com.neotech.steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class PersonalDetailsSteps extends CommonMethods {

	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify_employee_details(String licenceNo, String expDate, String smoker, String gender,
			String nationality) {

		sendText(personalDetails.licenceNo, licenceNo);

		wait(2);

		sendText(personalDetails.expDate, expDate);

		wait(2);

		waitForVisibility(personalDetails.personalDetailsForm);

		if (smoker.equals("Yes")) {

			click(personalDetails.smoker);

		}

		wait(1);
		click(personalDetails.genderInput);
		// 1st way. Locating the WebElement dynamically
		// click(driver.findElement(By.xpath("//span[text()='" + gender + "']")));

		// 2nd way
		List<WebElement> genderList = personalDetails.genderOptions;

		wait(1);
		for (WebElement option : genderList) {
			if (option.getText().equals(gender)) {
				click(option);
				break;
			}
		}
		
		
		click(personalDetails.nationality);

		List<WebElement> nationList = personalDetails.nationalityOptions;

		wait(1);
		for (WebElement option : nationList) {
			if (option.getText().equals(nationality)) {
				click(option);
				break;
			}
		}

		wait(2);

		waitForVisibility(personalDetails.personalDetailsForm);

		wait(2);

	}

	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {

		click(personalDetails.detailsBtnSave);

	}

}