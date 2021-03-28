package com.automation.stepsdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.resources.SharedResources;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginPageStepDefinition {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

	@Before
	public void setUp() {
		System.out.println("============= Scenario Started  =============");
	}

	@After
	public void closeBrowser() {
		driver.close();
	}

	public LoginPageStepDefinition(SharedResources sharedResources) {
		driver = sharedResources.getDriver();
		homePage = sharedResources.getHomePage();
		loginPage = sharedResources.getLoginPage();
	}

	@Given("application is open")
	public void application_is_open() {
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("^user enters username as (.*)$")
	public void user_enters_username(String username) {
		loginPage.setUid(username);
	}

	@And("^user enters password as (.*)$")
	public void user_enters_password(String password) {
		loginPage.setPwd(password);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLoginbtn();
	}

	@When("user enters below single rowdata as username")
	public void user_enters_below_data_as_username(DataTable dataTable) {
		List<String> list = dataTable.asList();
		loginPage.setUid(list.get(0));
	}

	@When("user enters below multi rowdata as username")
	public void user_enters_below_datatable_as_username(DataTable dataTable) {
		List<List<String>> lists = dataTable.asLists();

		for(List<String> list : lists) {
			loginPage.setUid(list.get(0));
		}
	}

	@And("user enters below single rowdata as password")
	public void user_enters_below_data_as_password(DataTable dataTable) {
		List<String> list = dataTable.asList();
		loginPage.setPwd(list.get(0));
	}


	@And("user enters below multi rowdata as password")
	public void user_enters_below_datatable_as_password(DataTable dataTable) {
		List<List<String>> lists = dataTable.asLists();
		for(List<String> list : lists) {
			loginPage.setPwd(list.get(0));
		}
	}

	@When("user enters below header single rowdata as username")
	public void user_enters_below_header_single_rowdata_as_username(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps();
		loginPage.setUid(map.get(0).get("uid"));
	}

	@And("user enters below header single rowdata as password")
	public void user_enters_below_header_single_rowdata_as_password(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps();
		loginPage.setPwd(map.get(0).get("pwd"));
	}

	@When("user enters below header multi rowdata as username")
	public void user_enters_below_header_multi_rowdata_as_username(DataTable dataTable) {
		List<Map<String,String>> maps = dataTable.asMaps();
		for(Map<String,String> map : maps) {
			loginPage.setUid(map.get("uid"));
		}
	}

	@When("user enters below header multi rowdata as password")
	public void user_enters_below_header_multi_rowdata_as_password(DataTable dataTable) {
		List<Map<String,String>> maps = dataTable.asMaps();
		for(Map<String, String> map : maps) {
			loginPage.setPwd(map.get("pwd"));
		}
	}

}
