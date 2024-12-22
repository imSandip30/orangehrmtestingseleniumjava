package com.CarnationTestingShastra24KDD;

import java.time.Duration;
import java.util.NoSuchElementException;

//import org.apache.maven.doxia.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;


import com.CarnationTestingShastra24KDD.errors.InvalidBrowserError;

public class Keyword {

	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait = null;
    private static final  Logger lOG =Logger.getLogger(Keyword.class);
    
	public void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("Launched Chrome Browser");
			lOG.info("Launched Chrome Browser");
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Launched Firefox Browser");
			lOG.info("Launched Chrome Browser");
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
			System.out.println("Launched Safari Browser");
			lOG.info("Launched Chrome Browser");
		} else {
			throw new InvalidBrowserError(browserName);
		}

		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void enterText(String locator, String textToEnter) {

		driver.findElement(By.xpath(locator)).sendKeys(textToEnter);
	}
	
	public void enterText(String locatorType, String loactorValue, String textToEnter) {

	//	driver.findElement(By.xpath(locator)).sendKeys(textToEnter);
		
		if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(loactorValue)).sendKeys(textToEnter);
		} else if(locatorType.equalsIgnoreCase("name")){
			driver.findElement(By.name(loactorValue)).sendKeys(textToEnter);
		} else if(locatorType.equalsIgnoreCase("tagname")){
			driver.findElement(By.tagName(loactorValue)).sendKeys(textToEnter);
		} else if(locatorType.equalsIgnoreCase("classname")){
			driver.findElement(By.className(loactorValue)).sendKeys(textToEnter);
		} else if(locatorType.equalsIgnoreCase("linktext")){
			driver.findElement(By.linkText(loactorValue)).sendKeys(textToEnter);
		} else if(locatorType.equalsIgnoreCase("partiallinktext")){
			driver.findElement(By.partialLinkText(loactorValue)).sendKeys(textToEnter);
		} else if(locatorType.equalsIgnoreCase("cssselector")){
			driver.findElement(By.cssSelector(loactorValue)).sendKeys(textToEnter);
		} else if(locatorType.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(loactorValue)).sendKeys(textToEnter);
		} else {
			throw new InvalidSelectorException(locatorType);
		}
		
	}
	
	/**
	 * Use this method to click on {@code WebElement} by its Xpath. This method doesnot support other locator.
	 * @param locator
	 */
	public void clickOn(String locator) {

		driver.findElement(By.xpath(locator)).click();
	}
	
	/**
	 * This menthod use to click Webelement. You need to provide locatorType and loactorValue.
	 * @param locatorType that is one of following : id, name, className, cssSelector, Xpath, linkText etc.
	 * @param loactorValue
	 */
	public void clickOn(String locatorType, String loactorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(loactorValue)).click();
		} else if(locatorType.equalsIgnoreCase("name")){
			driver.findElement(By.name(loactorValue)).click();
		} else if(locatorType.equalsIgnoreCase("tagname")){
			driver.findElement(By.tagName(loactorValue)).click();
		} else if(locatorType.equalsIgnoreCase("classname")){
			driver.findElement(By.className(loactorValue)).click();
		} else if(locatorType.equalsIgnoreCase("linktext")){
			driver.findElement(By.linkText(loactorValue)).click();
		} else if(locatorType.equalsIgnoreCase("partiallinktext")){
			driver.findElement(By.partialLinkText(loactorValue)).click();
		} else if(locatorType.equalsIgnoreCase("cssselector")){
			driver.findElement(By.cssSelector(loactorValue)).click();
		} else if(locatorType.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(loactorValue)).click();
		} else {
			throw new InvalidSelectorException(locatorType);
		}	
	}

	public WebElement waitForElementToBeVisible(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by);
	}
	
	public  void navigateToURL(String URL) {
		driver.navigate().to(URL);

	}
	
}
