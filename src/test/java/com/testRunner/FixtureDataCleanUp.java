package com.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false,
  features = {"src/test/resources/features/fixtureData/DeleteData.feature"},
  glue = {"com.steps", "com.utils"},
        tags = {"@DataClean"},
        plugin = {"pretty", "html:target/site/cucumber-pretty",
                "json:target/cucumberCleanUp.json"
                 })
public class FixtureDataCleanUp {
}
