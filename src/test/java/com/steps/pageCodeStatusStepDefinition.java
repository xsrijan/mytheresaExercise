package com.steps;

import java.io.IOException;


import com.utils.BaseUtils;
import com.utils.ConfigUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class pageCodeStatusStepDefinition 
{
	BaseUtils base;
	
	ConfigUtils configUtils;
	
	public pageCodeStatusStepDefinition (BaseUtils base) {
	    super();
	    this.base = base;
	    this.configUtils = new ConfigUtils(base.getDriver());
	}
	
	
	@Given("User navigates to the given {string}")
	public void user_navigates_to_the_given(String webPage) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 configUtils.findHyperlinks(webPage);
	}

	@Given("User checks for hyperlink on the page")
	public void user_checks_for_hyperlink_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("All hyperlinked check");
	}



	@Then("Webpage should return {int} or {int}x")
	public void webpage_should_return_or_x(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test executed successfully");
	}


}
