package com.Carnation24KDD.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CarnationTestingShastra24KDD.Keyword;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;




public class AddEmployeePage {

   // WebDriver driver;
   // private static final Logger LOG = LogManager.getLogger(AddEmployeePage.class);
    private static final  Logger lOG =Logger.getLogger(AddEmployeePage.class);
   // private static final  Logger lOG =Logger.getLogger(Keyword.class);

    // Locators for Add Employee page elements
    /*
    //@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")
     WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")
    WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
    WebElement middleNameField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    WebElement saveButton;

    @FindBy(xpath = "#btnCancel")
    WebElement cancelButton;
    
    @FindBy(css = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    WebElement employeeIdField;*/
    
    @FindBy(name = "firstName")
    WebElement firstNameField;

    @FindBy(name = "lastName")
    WebElement lastNameField;

    @FindBy(name = "middleName")
    WebElement middleNameField;

  //  @FindBy(name = "employeeId")
  //  WebElement employeeIdField;
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    WebElement employeeIdField;
    

  //  @FindBy(name = "btnSave")
   // WebElement saveButton;
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    WebElement saveButton;

    // Constructor to initialize elements
    public AddEmployeePage() {
        //this.driver = driver;
    	PageFactory.initElements(Keyword.driver,this);
    }

    // Method to enter first name
    public void enterFirstName(String firstName) {
    	
        System.out.println(firstName);
        firstNameField.sendKeys(firstName);
        lOG.info("Entering first name: " + firstName);
    	
    }

    // Method to enter last name
    public void enterLastName(String lastName) {
    	lOG.info("Entering last name: " + lastName);
        lastNameField.sendKeys(lastName);
    }

    // Method to enter middle name
    public void enterMiddleName(String middleName) {
    	lOG.info("Entering middle name: " + middleName);
        middleNameField.sendKeys(middleName);
    }

    // Method to click the Save button
    public void clickSaveButton() {
    	lOG.info("Clicking the Save button");
        saveButton.click();
    }
    
    // Method to enter employee ID
    public void enterEmployeeId(String employeeId) {
    	lOG.info("Entering employee ID: " + employeeId);
        employeeIdField.sendKeys(employeeId);
    }

    // Method to click the Cancel button
    public void clickCancelButton() {
    	lOG.info("Clicking the Cancel button");
     //   cancelButton.click();
    }
}
