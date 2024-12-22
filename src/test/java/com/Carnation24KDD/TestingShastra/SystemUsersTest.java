package com.Carnation24KDD.TestingShastra;

//package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Carnation24KDD.pages.LoginPage;
import com.Carnation24KDD.pages.SystemUsersPage;
import com.CarnationTestingShastra24KDD.Keyword;
import com.CarnationTestingShastra24KDD.Base.TestBase;

//public class SystemUsersTest extends TestBase {
	public class SystemUsersTest  {
    
	//SystemUsersPage systemUsersPage = new SystemUsersPage();
    @BeforeMethod
    public void loginAndNavigateToAdminModule() throws InterruptedException {
    	Keyword keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1500);
	//	keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();
    	LoginPage loginPage = new LoginPage();
    	Thread.sleep(500);
    	loginPage.enterUserName("Admin");
    	Thread.sleep(500);
    	loginPage.enterPassword("admin123");
    	Thread.sleep(500);
    	loginPage.clickOnBtn();
    	Keyword.driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
    	Thread.sleep(500);
    }

    @Test
    public void testSearchUser() throws InterruptedException {
    	
	
    	SystemUsersPage systemUsersPage = new SystemUsersPage();
    	Thread.sleep(1500);
        systemUsersPage.searchUser("Admin");
        Thread.sleep(1500);
        Assert.assertTrue(systemUsersPage.isUserPresent("Admin"), "User not found!");
    }

    @Test
    public void testAddUser() throws InterruptedException {
    	
    	SystemUsersPage systemUsersPage = new SystemUsersPage();
        systemUsersPage.clickAddUser();
        // Add logic for filling the Add User form here
        Assert.assertTrue(systemUsersPage.isUserPresent("NewUser"), "User not added!");
    }

    //@Test
    public void testDeleteUser() throws InterruptedException {
    	
		
    	SystemUsersPage systemUsersPage = new SystemUsersPage();
        systemUsersPage.searchUser("UserToDelete");
        Assert.assertTrue(systemUsersPage.isUserPresent("UserToDelete"), "User to delete not found!");
        systemUsersPage.clickDeleteUser();
        systemUsersPage.confirmDelete();
        Assert.assertFalse(systemUsersPage.isUserPresent("UserToDelete"), "User not deleted!");
    }
}

