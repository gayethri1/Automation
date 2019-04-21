package com.chandana.Cucumber_Selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {

	private WebDriver driver;

	public GoogleHomePage() {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openGoogleHomePage() {
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
	}

	public String findAboutElement() {
		WebElement aboutLinkText = driver.findElement(By.linkText("About"));
		return aboutLinkText.getText();
	}

	public String findStoreElement() {
		WebElement aboutLinkText = driver.findElement(By.linkText("Store"));
		return aboutLinkText.getText();
	}

	public String findGmailElement() {
		WebElement aboutLinkText = driver.findElement(By.linkText("Gmail"));
		return aboutLinkText.getText();
	}

	public String findImagesElement() {
		WebElement aboutLinkText = driver.findElement(By.linkText("Images"));
		return aboutLinkText.getText();
	}

	public String findSearchElement() {
		// WebElement aboutLinkText = driver.findElement(By.);
		// return aboutLinkText.getText();
		return null;
	}

	public boolean isAboutElementDisplayed() {
		WebElement aboutElement = driver.findElement(By.linkText("About"));
		return aboutElement.isDisplayed();
	}

	public void closeBrowser() {
		driver.close();
	}

}
