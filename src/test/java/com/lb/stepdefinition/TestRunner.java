package com.lb.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test/resources//Features", 
					glue = "com.lb.stepdefinition", 
					plugin = "html:target/cucumber-report.html",
					monochrome = true,
					dryRun = false,
					tags = "@ignore and @smoke")

public class TestRunner {

}
