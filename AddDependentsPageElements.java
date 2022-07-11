package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddDependentsPageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id=\"socialMediaDiv\"]/div/a/i")
	public WebElement addBtn;

	@FindBy(xpath = "//span[text()='Assigned Dependents']")
	public WebElement assignedDependents;
	
	@FindBy(xpath= "//h5[text()='Add Dependent']")
	public WebElement addDependentsFrame;
	

	@FindBy(xpath = "//*[@id='name']")
	public WebElement name;

	@FindBy(xpath = "//input[@id='date_of_birth']")
	public WebElement DOB;
	
	@FindBy( xpath= "//div[@class='filter-option-inner-inner']")
	public WebElement relationship;
	
	
	@FindBy (xpath = "//input[@id='relationship']")
	public WebElement specify;
	
	@FindBy (xpath = "//*[@id='modal-save-button']")
	public WebElement saveBtn;
	
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']")
	public List<WebElement> relationshipOptions;
	
	
	@FindBy(xpath = "//*[@id=\"3\"]")
	public WebElement certificateNo;

	@FindBy(xpath = "//*[@id=\"4\"]")
	public WebElement registrationDateField;

	@FindBy(xpath = "//*[@id='P442404663_root']")
	public WebElement registrationDate;

	@FindBy(xpath = "//*[@id='P442404663_root']/div/div/div/div/div[2]/div/div[2]/input")
	public WebElement registrationDateYear;

	@FindBy(xpath = "//*[@id=\"select-options-fd236a54-3ccb-8f76-3950-3c9c43767444\"]")
	public WebElement registrationDateYearOptions;

	@FindBy(xpath = "//*[@id='P442404663_root']/div/div/div/div/div[2]/div/div[1]/input")
	public WebElement registrationDateMonth;

	@FindBy(xpath = "//*[@id='select-options-344de70e-59d7-4593-c4ca-1fcfc68ed38b']")
	public WebElement registrationDateMonthOptions;

	@FindBy(xpath = "//*[@id='P442404663_table']")
	public WebElement registrationDateDays;

	@FindBy(xpath = "//button[@class=' btn waves-effect waves-green ']")
	public WebElement saveMarriageInfo;

	

	public AddDependentsPageElements() {
		PageFactory.initElements(driver, this);

	}

}
