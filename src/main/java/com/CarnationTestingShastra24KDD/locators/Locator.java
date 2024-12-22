package com.CarnationTestingShastra24KDD.locators;

public interface Locator {

	String userName = "//input[@name=\"username\"]";
	String password = "//input[@name=\"password\"]";
	String submit = "//div[contains(@class,\"oxd-form-actions\")]/button[contains(@class,\"oxd-button\")]";
	String viewPIMModule = "//a[contains(@href,\"/web/index.php/pim/viewPimModule\")]";
	String addBtn = "//button[text() = \" Add \"]";
	String firstName = "//input[@name=\"firstName\"]";
	String middleName = "//input[@name=\"middleName\"]";
	String lastName = "//input[@name=\"lastName\"]";
	String saveBtn = "//button[text() =\" Save \"]";
	String adminModule = "//a[contains(@href,\"AdminModule\")]";
	String addBtnInadminModule = "//button[text() = \" Add \"]";
	String UserRole = "(//div[@class=\"oxd-select-text-input\"])[1]";
	String selectESS = "//div[@role='listbox']/descendant::*[contains(text(),'ESS')]";
	String hintsOfEmpName = "//input[@placeholder=\"Type for hints...\"]";
	String searchInHintsOfEmpName = "//div[@role='option']/span";
	
}
