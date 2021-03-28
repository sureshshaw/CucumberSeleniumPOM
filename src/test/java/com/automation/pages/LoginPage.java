package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(className="radius")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage setUid(String uid) {
		username.sendKeys(uid);
		return new LoginPage(driver);
	}
	
	public LoginPage setPwd(String pwd) {
		password.sendKeys(pwd);
		return new LoginPage(driver);
	}
	
	public HomePage clickOnLoginbtn() {
		loginBtn.click();
		return new HomePage(driver);
	}
}
