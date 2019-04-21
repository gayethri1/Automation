package com.chandana.Cucumber_Selenium.stepdefinitions;

import org.junit.Assert;

import com.chandana.Cucumber_Selenium.pageobjects.GoogleHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GoogleHomePageStepDenifitions {

	private GoogleHomePage googleHomePage;

	public GoogleHomePageStepDenifitions() {
		googleHomePage = new GoogleHomePage();
	}

	@Given("^I go to google\\.com$")
	public void i_go_to_google_com() throws Throwable {
		googleHomePage.openGoogleHomePage();
	}

	@Then("^I see About link$")
	public void i_see_About_link() throws Throwable {
		Assert.assertEquals(true, googleHomePage.isAboutElementDisplayed());
		googleHomePage.closeBrowser();

	}

}
