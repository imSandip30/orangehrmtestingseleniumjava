package com.Carnation24KDD.pages;

import com.CarnationTestingShastra24KDD.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	// @BeforeMethod
	@Before
	public void setup() throws InterruptedException {
		System.out.println("I am in hooks");
		Keyword keyword = new Keyword();
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();
	}

	@After
	public void tearDown() {

		Keyword.driver.quit();
	}
}
