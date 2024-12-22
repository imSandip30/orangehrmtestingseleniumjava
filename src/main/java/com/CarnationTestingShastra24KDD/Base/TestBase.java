package com.CarnationTestingShastra24KDD.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Carnation24KDD.pages.LoginPage;
import com.CarnationTestingShastra24KDD.Keyword;
import com.CarnationTestingShastra24KDD.Util.App;

import io.cucumber.java.Before;

public class TestBase {

	//@BeforeMethod
	@Before
	public void setup() throws InterruptedException {
		Keyword keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();
	
	}

	//@AfterMethod
	public void tearDown() {

		Keyword.driver.quit();
	}
}
