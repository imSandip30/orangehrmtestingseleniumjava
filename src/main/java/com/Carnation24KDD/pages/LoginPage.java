package com.Carnation24KDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CarnationTestingShastra24KDD.Keyword;

public class LoginPage {

	//@FindBy(css="input[name=\"username\"]")
	@FindBy(xpath="//input[@name=\"username\"]")
    WebElement usernameTxtBx;
	
	@FindBy(css="input[name=\"password\"]")
    WebElement passwordTxtBx;
	
	@FindBy(css="button[type=\"submit\"]")
    WebElement loginBtn;
	
	
	public LoginPage() {
        PageFactory.initElements(Keyword.driver,this);
	}
	
	public void enterUserName(String username)
	{
		usernameTxtBx.sendKeys(username);
		//LoginPage = PageFactory.initElements(null, username);
	}
	
	
	public void enterPassword(String password)
	{
		passwordTxtBx.sendKeys(password);
		//LoginPage = PageFactory.initElements(null, username);
	}
	
	
	public void clickOnBtn()
	{
		loginBtn.click();
		//LoginPage = PageFactory.initElements(null, username);
	}
	
	
}

