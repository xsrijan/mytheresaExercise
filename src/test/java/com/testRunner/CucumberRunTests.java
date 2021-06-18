package com.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false,
        features = {"src/test/resources/features"},
        glue = {"com.steps", "com.utils"},
        tags = {"@test"},
       // tags = {"@Case&Planning"},
        plugin = {"pretty", "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"},
        monochrome = true
        )
public class CucumberRunTests {
}
