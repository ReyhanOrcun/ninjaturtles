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
	
	

	public AddDependentsPageElements() {
		PageFactory.initElements(driver, this);

	}

}
