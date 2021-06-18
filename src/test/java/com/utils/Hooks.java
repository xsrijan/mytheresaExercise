package com.utils;

import java.io.IOException;
import java.util.Properties;

import com.saucelabs.common.SauceOnDemandSessionIdProvider;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseUtils implements SauceOnDemandSessionIdProvider {
    BaseUtils base;
    protected String sessionId;
   
    public boolean remote;
	protected String browserName;
	private RemoteWebDriver webDriver;
	protected Properties properties;
    protected boolean localMode = true;	//test are executed locally
	//protected boolean localMode = false;	//tests are executed on saucelab
    @Before
    public void init(Scenario scenario) throws IOException{
        System.out.println("Running before hook to set credentials, URLs and the driver...");
        
       
    
	}

    public Hooks(BaseUtils base) {
        this.base = base;
    }

    private String createSauceLabsURL() {
         String username = ConfigUtils.properties.get("SAUCE_USERNAME");
         String accesskey = ConfigUtils.properties.get("SAUCE_ACCESS_KEY");
         String url = "https://"+username+":"+accesskey+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
         System.out.println("URL"+url);
         return url;
    }

    @After
    public void tearDown(Scenario scenario) {
        if (remote) {
            //sauceUtils.updateSauceResults(!scenario.isFailed(), sessionId); //update results in saucelabs
            System.out.println(sessionId);
            System.out.println(!scenario.isFailed());
        }
      //  driver.quit();
    }

    @Override
    public String getSessionId() {
        return sessionId;
    }
}
