package com.chandana.Cucumber_Selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	private WebDriver webDriver;

	public HomePage() {
		System.setProperty("webdriver.chrome.driver", "/softwares/chromedriver.exe");
		webDriver = new ChromeDriver();
	}

	public void openGoogleHomePage() {
		webDriver.get("https://www.google.com/");
	}

	public boolean isAboutElementDisplayed() {
		WebElement aboutElement = webDriver.findElement(By.linkText("About"));
		return aboutElement.isDisplayed();
	}

	public void closeBrowser() {
		webDriver.close();
	}

}
