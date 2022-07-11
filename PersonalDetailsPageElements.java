package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {

	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "pim.navbar.employeeName")
	public WebElement employeeName;

	@FindBy(id = "licenseNo")
	public WebElement licenceNo;
	
	@FindBy(xpath = "//label[@for='smoker']")
	public WebElement smoker;
	
	
	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/input")
	public WebElement genderInput;

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/ul/li")
	public List<WebElement> genderOptions;
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/input")
	public WebElement nationality;
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/ul/li")
	public List<WebElement> nationalityOptions;
	
	@FindBy(id = "emp_dri_lice_exp_date")
	public WebElement expDate;
	
	@FindBy(id = "top-menu-trigger")
	public WebElement more;
	
	
	@FindBy(xpath = "//span[text()='Dependents']")
	public WebElement dependents;
	
	
	
	
	
	@FindBy(xpath = "//form[@id='pimPersonalDetailsForm']//button[@type='submit']")
	public WebElement detailsBtnSave;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
