package com.chandana.Cucumber_Selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openLoginPage() {
		String baseUrl = "http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
	}

	public void submitLoginData(String emailId, String passwordInfo) {

		WebElement email = driver.findElement(By.id("email"));

		// Get the WebElement corresponding to the Password Field
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys(emailId);
		password.sendKeys(passwordInfo);

		// Find the submit button
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();

	}

	public String getLoginSuccessPageUrl() {
		return driver.getCurrentUrl();
	}

}
