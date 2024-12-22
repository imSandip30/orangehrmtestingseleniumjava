package com.testingshastra.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    tags = "",  // You can specify tags for test filtering
    features = {"src/test/resources/feature"},  // Path to feature file(s)
    glue = {"com.Carnation24KDD2.steps","com.Carnation24KDD.pages"},  // Path to step definition classes
    dryRun = false,
    plugin = {
        "pretty",  // Pretty output in the console
        //"json:target/cucumber-reports/CucumberTestReport.json",  // JSON output for further processing
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"  // Allure reporting plugin
    }
)
public class FeatureRunner extends AbstractTestNGCucumberTests {
    // No need for extra methods; this class is used to run the Cucumber tests
}




    
