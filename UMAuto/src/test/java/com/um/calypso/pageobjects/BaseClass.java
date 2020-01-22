package com.um.calypso.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	private final String chromeDriverPath = ".\\src\\main\\resources\\drivers\\chromedriver.exe";
	// private final String
	// firefoxDriverPath=".\\src\\main\\resources\\drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe";

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
