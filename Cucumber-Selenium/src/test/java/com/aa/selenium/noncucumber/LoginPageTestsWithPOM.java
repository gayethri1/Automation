package com.aa.selenium.noncucumber;

import org.junit.Assert;
import org.junit.Test;

import com.chandana.Cucumber_Selenium.pageobjects.LoginPage;

public class LoginPageTestsWithPOM {

	private LoginPage loginPage = new LoginPage();
	// private LoginSuccessPage loginSuccessPage = new LoginSuccessPage();

	@Test
	public void verifyLoginWithValidCredentials() throws Exception {
		// open the page
		loginPage.openLoginPage();

		loginPage.submitLoginData("abcd@gmail.com", "abcdefghlkjl");

		// using submit method to submit the form. Submit used on password field
		Assert.assertEquals("http://demo.guru99.com/test/success.html", loginPage.getLoginSuccessPageUrl());

	}

}
