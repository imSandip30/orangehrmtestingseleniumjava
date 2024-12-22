package com.Carnation24KDD.TestingShastra;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CarnationTestingShastra24KDD.Keyword;
import com.CarnationTestingShastra24KDD.Base.TestBase;
import com.Carnation24KDD.pages.LoginPage;

//public class Login_TestCase extends TestBase{
	public class Login_TestCase {
public void verifyLoginTest() throws InterruptedException {
	
	Keyword keyword = new Keyword();
	keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	Keyword.driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	Keyword.driver.findElement(By.xpath("//div[contains(@class,\"oxd-form-actions\")]/button[contains(@class,\"oxd-button\")]")).click();
	//keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"/web/index.php/pim/viewPimModule\")]"));
	//Assert.assertTrue();

}

public void verifyLoginTest1() throws InterruptedException {
	
	Keyword keyword = new Keyword();
	keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	
	//LoginPage loginPage = PageFactory.initElements(keyword.driver, LoginPage);
	
	Keyword.driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	Keyword.driver.findElement(By.xpath("//div[contains(@class,\"oxd-form-actions\")]/button[contains(@class,\"oxd-button\")]")).click();
	keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"/web/index.php/pim/viewPimModule\")]"));
	//Assert.assertTrue();

}
//@Test
public void verifyLoginTestPOM() throws InterruptedException {
	
	LoginPage loginPage = new LoginPage();
	Thread.sleep(1500);
	loginPage.enterUserName("Admin");
	Thread.sleep(1500);
	loginPage.enterPassword("admin123");
	Thread.sleep(1500);
	loginPage.clickOnBtn();
	
	
}
}
