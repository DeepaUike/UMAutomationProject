package com.um.calypso.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By homePageSearchProviderLink = By.id("Search Provider");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

}
