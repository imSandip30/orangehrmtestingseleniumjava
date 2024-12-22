package com.Carnation24KDD2.steps;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import com.CarnationTestingShastra24KDD.Keyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import com.orangehrm.pages.AdminPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

import com.Carnation24KDD.pages.LoginPage;
import com.Carnation24KDD.pages.SystemUsersPage;
import com.Carnation24KDD.pages.AdminPage;

import com.CarnationTestingShastra24KDD.Base.TestBase;

//import static org.junit.Assert.*;

public class AdminModuleSteps {

//  / WebDriver driver = new ChromeDriver();
    AdminPage adminPage = new AdminPage();

    @Given("the user is logged in as an admin")
    public void loginAsAdmin() throws InterruptedException {
    	  // Navigate to the Add Employee page
    	Keyword keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();  	
    	LoginPage loginPage = new LoginPage();
    	Thread.sleep(1500);
    	loginPage.enterUserName("Admin");
    //	Thread.sleep(1500);
    	loginPage.enterPassword("admin123");
    	//Thread.sleep(1500);
    	loginPage.clickOnBtn();
    	//Object keyword;
		//keyword.driver.launchUrl();//.navigateToAdmin(); // Assuming this method already exists to go directly to the Add Employee page
    //	Keyword keyword = new Keyword();
    	Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
    //	keyword.launchUrl();
    }

    @When("the user navigates to the Admin module")
    public void navigateToAdminModule() {
    	Keyword keyword = new Keyword();
    	Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
    	  
       // adminPage.navigateToAdmin();
    }

    @When("the user clicks on the \"Add\" button")
    public void clickAddButton() {
        adminPage.clickAddButton();
    }

    @When("the user enters {string} as username, {string} as password, and {string} as email")
    public void enterUserDetails(String username, String password, String email) {
        adminPage.enterUsername(username);
        adminPage.enterPassword(password);
        adminPage.enterEmail(email);
    }

    @When("the user clicks save")
    public void clickSaveButton() {
        adminPage.clickSaveButton();
    }

    @Then("the new user {string} should be added successfully")
    public void verifyUserAdded(String username) {
        assertTrue(adminPage.isUserPresent(username));
    }

    @When("the user selects the {string} from the user list")
    public void selectUser(String username) {
        adminPage.selectUser(username);
    }

    @When("the user changes the email to {string}")
    public void changeEmail(String newEmail) {
        adminPage.enterEmail(newEmail);
        adminPage.clickSaveButton();
    }

    @Then("the user's email should be updated to {string}")
    public void verifyUserEmailUpdated(String newEmail) {
        // Verify logic to check the updated email
        assertTrue(adminPage.isUserPresent(newEmail));
    }

    @When("the user clicks the delete button")
    public void clickDeleteButton() {
        adminPage.deleteUser();
    }

    @Then("the user {string} should be deleted successfully")
    public void verifyUserDeleted(String username) {
        assertFalse(adminPage.isUserPresent(username));
    }

    @When("the user searches for {string}")
    public void searchForUser(String username) {
        adminPage.searchForUser(username);
    }

    @Then("the user {string} should be found in the search results")
    public void verifyUserInSearchResults(String username) {
        assertTrue(adminPage.isUserPresent(username));
    }
}
