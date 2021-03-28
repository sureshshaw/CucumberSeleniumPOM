package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	@FindBy(className="button secondary radius")
	private WebElement logOutBtn;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isLogoutButtonExists() {
		
		if(logOutBtn.isDisplayed())
			return true;
		
		return false;
	}
}
