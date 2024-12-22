package com.Carnation24KDD2.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Carnation24KDD.pages.AddEmployeePage;
import com.Carnation24KDD.pages.LoginPage;
import com.CarnationTestingShastra24KDD.Keyword;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {

	// AddEmployeePage addEmployeePage = new AddEmployeePage(Driver.getDriver());

	@When("the user navigates to the Add Employee page")
	public void navigateToAddEmployeePage() throws InterruptedException {
		// Navigate to the Add Employee page
	//	Keyword keyword = new Keyword();
	//	keyword.launchBrowser("Chrome");
	//	keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// keyword.launchUrl(App.getAppUrl("qa"));
	//	Keyword.driver.manage().window().maximize();
		LoginPage loginPage = new LoginPage();
		Thread.sleep(1500);
		loginPage.enterUserName("Admin");
		// Thread.sleep(1500);
		loginPage.enterPassword("admin123");
		// Thread.sleep(1500);
		loginPage.clickOnBtn();
		// Object keyword;
		// keyword.driver.launchUrl();//.navigateToAdmin(); // Assuming this method
		// already exists to go directly to the Add Employee page
		// Keyword keyword = new Keyword();
		Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		// keyword.launchUrl();
	}

	@When("the user enters {string} as first name, {string} as last name, {string} as middle name, and {string} as employee ID")
	public void enterEmployeeDetails(String firstName, String lastName, String middleName, String employeeId)
			throws InterruptedException {
		AddEmployeePage addEmployeePage = new AddEmployeePage();
		Thread.sleep(1500);
		addEmployeePage.enterFirstName(firstName);
		addEmployeePage.enterLastName(lastName);
		addEmployeePage.enterMiddleName(middleName);
		addEmployeePage.enterEmployeeId(employeeId);
		addEmployeePage.clickSaveButton();
	}

	@When("the user clicks the Save button")
	public void clickSaveButton() {
		AddEmployeePage addEmployeePage = new AddEmployeePage();
		addEmployeePage.clickSaveButton();
	}

	@When("the user clicks the Cancel button")
	public void clickCancelButton() throws InterruptedException {
		// AddEmployeePage addEmployeePage = new AddEmployeePage();
		// addEmployeePage.clickCancelButton();
		Thread.sleep(1500);
		Keyword.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");

		Keyword keyword = new Keyword();

		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("employee_table")));
		// // Wait until the employee table is visible
		Thread.sleep(1500);

		// public void searchUser(String username) {

		WebElement searchField = keyword.driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		searchField.sendKeys("jones");
		WebElement searchButton = keyword.driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		searchButton.click();
		// }
		Thread.sleep(500);

		// WebElement checkbox =
		// keyword.driver.findElement(By.xpath("//td[contains(text(), '" + "sandip" +
		// "')]//preceding-sibling::td/input[@type='checkbox']"));

		// *[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div

		// List<WebElement> tableRows =
		// keyword.driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div"));
		List<WebElement> tableRows = keyword.driver
				.findElements(By.xpath(" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div"));
		System.out.println("tableRows no: " + tableRows.size());

		/*
		 * for (int i = 0; i < tableRows.size(); i++) { //getText
		 * System.out.println(tableRows.get(i).getText()); }
		 */
		for (WebElement row : tableRows) {
			// System.out.println(username);
			System.out.println(row.getText());
			if (row.getText().contains("Emily")) {

				// checkbox.click();

				// Now click the "Delete" button from the "Actions" column
				WebElement deleteButton = keyword.driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']"));
				Thread.sleep(1500);
				deleteButton.click();
				Thread.sleep(1500);
				System.out.println("Employee " + "Emily" + " deleted successfully.");
				// return true;
			}
		}

	}

	@Then("the employee should be saved successfully")
	public void verifyEmployeeSaved() {
		AddEmployeePage addEmployeePage = new AddEmployeePage();
		// Verify employee is saved (this can be a check on the employee list or a
		// success message)
		// Assert.assertTrue("Employee was not saved!",
		// addEmployeePage.isEmployeeSaved()); // Implement this method if necessary
	}

	@Then("the employee addition should be canceled and the page should redirect to the previous screen")
	public void verifyEmployeeAdditionCancelled() {

		// Verify that the cancel button works and takes you back to the previous page
		// String currentUrl = Driver.getDriver().getCurrentUrl();
		// Assert.assertTrue("The cancel button didn't work",
		// currentUrl.contains("viewEmployeeList"));
	}
}
