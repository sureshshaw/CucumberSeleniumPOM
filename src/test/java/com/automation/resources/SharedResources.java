package com.automation.resources;

import org.openqa.selenium.WebDriver;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utilities.Utils;

public class SharedResources {
	private HomePage homePage;
	private LoginPage loginPage;
	private Utils utils;
	private WebDriver driver;
	
	public SharedResources() {
		utils = new Utils();
		driver = utils.getDriver();
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public HomePage getHomePage() {
		return homePage;
	}
	
	public LoginPage getLoginPage() {
		return loginPage;
	}
	
	public Utils getUtils() {
		return utils;
	}

}
