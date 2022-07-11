package com.neotech.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {

	@When("I login to the HRMS")
	public void i_login_to_the_hrms() {
		System.out.println("Login");
	}

	@When("I want to add Employees")
	public void i_want_to_add_employees(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//

		// List of Maps? - recap??

		/*
		 * Map<String, String> map1 = new HashedMap<>();
		 * 
		 * map1.put("firstname", "Kamer");
		 * 
		 * map1.put("middleName", "Can"); map1.put("lastName", "Akarsu");
		 * 
		 * Map<String, String> map2 = new HashedMap<>();
		 * 
		 * map2.put("firstname", "Brian");
		 * 
		 * // no middle name map2.put("lastName", "Smith");
		 * 
		 * Map<String, String> map3 = new HashedMap<>();
		 * 
		 * map3.put("firstname", "Tuba");
		 * 
		 * // no middle name map3.put("lastName", "Kutlu");
		 * 
		 * 
		 * List<Map<String, String>> lm= new ArrayList<>();
		 * 
		 * lm.add(map1); lm.add(map2); lm.add(map3);
		 */

		List<Map<String, String>> listOfMaps = dataTable.asMaps();

		for (Map<String, String> map : listOfMaps) {

			//System.out.println(map);
			
			System.out.println("First Name: " + map.get("FirstName"));
			System.out.println("Middle Name: " + map.get("MiddleName"));
			System.out.println("Last Name: " + map.get("LastName"));
		}

	}

	@Then("I validate employee added")
	public void i_validate_employee_added() {
		System.out.println("Validate employee added");
	}

}
