package com.aa.selenium.noncucumber;

import org.junit.Assert;
import org.junit.Test;

import com.chandana.Cucumber_Selenium.pageobjects.GoogleHomePage;

public class GoogleHomePageTestsWithPOM {

	private GoogleHomePage googleHomePage = new GoogleHomePage();

	@Test
	public void verifyGoogleHopmePageLinkTexts() throws Exception {
		// open the page
		googleHomePage.openGoogleHomePage();

		Assert.assertEquals("About", googleHomePage.findAboutElement());
		Assert.assertEquals("Store", googleHomePage.findStoreElement());
		Assert.assertEquals("Gmail", googleHomePage.findGmailElement());
		Assert.assertEquals("Images", googleHomePage.findImagesElement());

	}

}
