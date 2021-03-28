package com.automation.stepsdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.automation.pages.HomePage;
import com.automation.resources.SharedResources;

import io.cucumber.java.en.*;

public class HomePageStepDefinition {
	WebDriver driver;
	HomePage homePage;

	public HomePageStepDefinition(SharedResources sharedResources) {
		driver = sharedResources.getDriver();
		homePage = sharedResources.getHomePage();
	}

	@Then("user should see logout button")
	public void user_should_see_logout_button() {
		Assert.assertTrue(homePage.isLogoutButtonExists());
	}

}
