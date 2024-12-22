package com.Carnation24KDD.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CarnationTestingShastra24KDD.Keyword;

import java.util.List;

public class SystemUsersPage {
   // WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    WebElement searchButton;

   // @FindBy(css = "button[title='Add']")//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    WebElement addUserButton;

    @FindBy(css = "button[title='Delete']")
    WebElement deleteUserButton;

    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirmDeleteButton;

    //@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[6]")
    //@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]")
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div")
    List<WebElement> tableRows;

    public SystemUsersPage() {
       // this.driver = driver;
        PageFactory.initElements(Keyword.driver, this);
    }

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

    public void searchUser(String username) {
        searchField.sendKeys(username);
        searchButton.click();
    }

    public void clickAddUser() {
        addUserButton.click();
    }

    public void clickDeleteUser() {
        deleteUserButton.click();
    }

    public void confirmDelete() {
        confirmDeleteButton.click();
    }
}
