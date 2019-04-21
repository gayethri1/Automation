package com.chandana.Cucumber_Selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccessPage {

	private WebDriver driver;

	public LoginSuccessPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public String getLoginSuccessPageUrl() {
		return driver.getCurrentUrl();
	}
}
