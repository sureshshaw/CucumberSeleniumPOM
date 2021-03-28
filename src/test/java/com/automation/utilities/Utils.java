package com.automation.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {

	private WebDriver driver;

	public Utils() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
