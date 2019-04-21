package com.chandana.Cucumber_Selenium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "com.chandana.Cucumber_Selenium.stepdefinitions" })
public class TestRunner {

}
