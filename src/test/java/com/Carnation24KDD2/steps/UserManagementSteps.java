package com.Carnation24KDD2.steps;

import org.openqa.selenium.By;

import com.CarnationTestingShastra24KDD.Keyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserManagementSteps {

	

	@Given("open url")
	public void open_url() {
	    
		Keyword keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();
	
		
		// Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		
		

	}

	@Given("slogin into system")
	public void slogin_into_system() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		Keyword keyword = new Keyword();

		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		Keyword.driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		Keyword.driver.findElement(By.xpath("//div[contains(@class,\"oxd-form-actions\")]/button[contains(@class,\"oxd-button\")]")).click();
	}

	@When("when user clicks on PIM menu")
	public void when_user_clicks_on_pim_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Add button")
	public void user_clicks_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("creates user with valid details")
	public void creates_user_with_valid_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on admin menu")
	public void user_clicks_on_admin_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicks on Add button user management page")
	public void clicks_on_add_button_user_management_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user selects role as ESS and types employee name")
	public void user_selects_role_as_ess_and_types_employee_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("populated list must contain new created users name")
	public void populated_list_must_contain_new_created_users_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
