package com.steps;

import java.io.IOException;


import com.utils.BaseUtils;
import com.utils.ConfigUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLoginStepDefinition extends BaseUtils
{
BaseUtils base;

ConfigUtils configUtils;



public VerifyLoginStepDefinition (BaseUtils base) {
    super();
    this.base = base;
    this.configUtils = new ConfigUtils(base.getDriver());
}

@Given("User opens the webbrowser {string} with environment {string}")
public void user_opens_the_webbrowser_with_environment(String browser, String env) throws IOException {
    // Write code here that turns the phrase above into concrete actions
	 configUtils.setup(browser, env);
}

@Given("User navigates to the given url  {string}")
public void user_navigates_to_the_given_url(String webPage) {
    // Write code here that turns the phrase above into concrete actions
	 configUtils.getWebpage(webPage);
}

@When("User provides {string} and {string}")
public void user_provides_and(String Userid, String Password) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	configUtils.doLogin(Userid, Password);
}

@Then("User Login should haapen successfully")
public void user_Login_should_haapen_successfully() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   configUtils.validateLogin();
   configUtils.close();
}
	
}
