package com.steps;

import java.io.IOException;

import com.utils.BaseUtils;
import com.utils.ConfigUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition extends BaseUtils
{
BaseUtils base;

ConfigUtils configUtils;



public loginStepDefinition (BaseUtils base) {
    super();
    this.base = base;
    this.configUtils = new ConfigUtils(base.getDriver());
}

@Given("User opens the browser {string} with environment {string}")
public void user_opens_the_browser_with_environment(String browser, String env) throws IOException {
    // Write code here that turns the phrase above into concrete actions
	
   configUtils.setup(browser, env);
}

@Given("User navigates to the given  {string}")
public void user_navigates_to_the_given(String webPage) {
    // Write code here that turns the phrase above into concrete actions
    configUtils.getWebpage(webPage);
}


	
	@When("User checks for basic UI rendering")
	public void user_checks_for_basic_UI_rendering() {
	    // Write code here that turns the phrase above into concrete actions
	    configUtils.validateRenderingOfPage();

	}

	@Then("No Java Script error should be generated on the webpage")
	public void no_Java_Script_error_should_be_generated_on_the_webpage() {
	    // Write code here that turns the phrase above into concrete actions
		configUtils.findJavascriptErrors();
	}
	
	@Then("browser should be closed automatically")
	public void browser_should_be_closed_automatically() {
	    // Write code here that turns the phrase above into concrete actions
		configUtils.close();
	}
}
