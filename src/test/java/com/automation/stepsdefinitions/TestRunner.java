package com.automation.stepsdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features",
				 glue = "com/automation/stepsdefinitions", 
				 tags = "@SingleTag",
				 plugin = {"json:target/cucumber.json"},
				 monochrome = true)
public class TestRunner{
	
}