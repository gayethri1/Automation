package com.aa.selenium.noncucumber;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTests {

	private static WebDriver driver;

	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void closeCurrentPage() {
		driver.close();
	}

	@Test
	public void verifyRadioButtonPresent() {
		// get the data from browser

		driver.get("http://demo.guru99.com/test/ajax.html");
		WebElement webElement = driver.findElement(By.id("no"));

		// assert the data
		boolean isElementDisplayed = webElement.isDisplayed();
		Assert.assertTrue(webElement.isDisplayed());

	}

	@Test
	public void verifyLoginWithValidCredentials() throws Exception {
		// open the page

		String baseUrl = "http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		// Get the WebElement corresponding to the Email Address(TextField)
		WebElement email = driver.findElement(By.id("email"));

		// Get the WebElement corresponding to the Password Field
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");

		// Find the submit button
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();

		// using submit method to submit the form. Submit used on password field
		Assert.assertEquals("http://demo.guru99.com/test/success.html", driver.getCurrentUrl());

	}

	@Test
	public void verifyLoginWithInvalidCredentials() throws Exception {
		String baseUrl = "http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		// Get the WebElement corresponding to the Email Address(TextField)
		WebElement email = driver.findElement(By.id("email"));

		// Get the WebElement corresponding to the Password Field
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys("abcd@gmail.com");
		password.sendKeys("a");

		// Find the submit button
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		System.out.println("Login Done with Click");

		// using submit method to submit the form. Submit used on password field

		Assert.assertEquals("http://demo.guru99.com/test/success.html", driver.getCurrentUrl());

	}

}
