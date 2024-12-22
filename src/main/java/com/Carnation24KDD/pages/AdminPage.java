package com.Carnation24KDD.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CarnationTestingShastra24KDD.Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class AdminPage {

  //  WebDriver driver;
    //private static final Logger logger = LogManager.getLogger(AdminPage.class);

    // Locators for Admin page elements
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    WebElement addButton;
                     
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement searchUsernameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    WebElement searchButton;

    @FindBy(id = "btnSave")
    WebElement saveButton;

    @FindBy(xpath = "//a[contains(text(),'testUser')]")
    WebElement testUserLink;

    @FindBy(id = "systemUser_userType")
    WebElement roleDropdown;

    @FindBy(id = "systemUser_status")
    WebElement statusDropdown;

    @FindBy(name = "chkSelectRow[]")
    WebElement selectUserCheckbox;

    @FindBy(name = "btnDelete")
    WebElement deleteButton;
    
 // Added FindBy for Password and Email
    @FindBy(id = "systemUser_password")
    WebElement passwordField;

    @FindBy(id = "systemUser_email")
    WebElement emailField;
    
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div")
    List<WebElement> tableRows;
    
    @FindBy(id = "systemUser_confirmPassword")  // Confirm Password field locator
    WebElement confirmPasswordField;

    // Constructor to initialize elements
    public AdminPage() {
    	// this.driver = driver;
        PageFactory.initElements(Keyword.driver, this);
    }

    // Navigate to Admin Page
    public void navigateToAdmin() {
       // logger.info("Navigating to the Admin page");
     //   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
    }

    // Add new user method
    public void clickAddButton() {
   //     logger.info("Clicking on the Add button");
        addButton.click();
    }

    public void enterUsername(String username) {
    //    logger.info("Entering username: " + username);
        searchUsernameField.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
     //   logger.info("Entering password: " + password);
        passwordField.sendKeys(password);  // Using @FindBy initialized element
    }

    // Method to enter confirm password
    public void enterConfirmPassword(String confirmPassword) {
      //  logger.info("Entering confirm password: " + confirmPassword);
        confirmPasswordField.sendKeys(confirmPassword);  // Using @FindBy initialized element
    }

    // Method to enter email
    public void enterEmail(String email) {
     //   logger.info("Entering email: " + email);
        emailField.sendKeys(email);  // Using @FindBy initialized element
    }
    
    
    public void clickSaveButton() {
      //  logger.info("Clicking on the Save button");
        saveButton.click();
    }

    // Delete user method
    public void deleteUser() {
      //  logger.info("Deleting the user");
        deleteButton.click();
    }

    // Select user and edit details
    public void selectUser(String username) {
      //  WebElement userLink = driver.findElement(By.xpath("//a[text()='" + username + "']"));
      //  logger.info("Selecting user: " + username);
     //   userLink.click();
    }

    // Assign role to user
    public void assignRole(String role) {
     //   logger.info("Assigning role: " + role);
        roleDropdown.sendKeys(role);
    }

    // Activate or Deactivate user
    public void changeUserStatus(String status) {
      //  logger.info("Changing user status to: " + status);
        statusDropdown.sendKeys(status);
    }

    // Search for a user
    public void searchForUser(String username) {
     //   logger.info("Searching for user: " + username);
        searchUsernameField.sendKeys(username);
        searchButton.click();
    }

   // Verify if user is present
    public boolean isUserPresent(String username) {
        for (WebElement row : tableRows) {
        	System.out.println(username);
        	System.out.println(row.getText());
            if (row.getText().contains(username)) {
                return true;
            }
        }
        return false;
    }
    
    /* Verify if user is present
    public boolean isUserPresent(String username) {
        return driver.findElements(By.xpath("//a[text()='" + username + "']")).size() > 0;
    }*/
}

































