package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashBoardSteps extends CommonMethods{
	
	@Then ("I want to validate the items on the menu")
	public void validateMenu(DataTable  dataTable) {
		
		System.out.println(dataTable);
		
		List<String>   expectedList= dataTable.asList();
		
		List<String>    actualList= new ArrayList<>();
		
		for (WebElement el: dashboard.menuList) {
			
			
			
			
		}
		
		
	}

}
