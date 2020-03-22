package com.Naveen_Selenium_Training;
/**
 * @author mdhossain
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Util_for_Project {
	
	public static WebDriver driver;
	/**
	 * this is web-element method.
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = null;
		try {
			waitForElementPresent(driver,locator);
			element = driver.findElement(locator);
		}
		catch (Exception e){
		System.out.println("Web-elements didn't found ");
	}
		return element;
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void waitForElementPresent(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	/**
	 * 
	 * @param browser
	 * @return driver
	 */

	public static WebDriver initDriver(String browser) {
	if (browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/mdhossain/eclipse-workspace/QA_Eclipse_Java_Exercise/Naveen_Selenium_Training/drivers/chromeDriver/chromedriver");
		driver = new ChromeDriver();
	}
	else if (browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver","/Users/mdhossain/eclipse-workspace/QA_Eclipse_Java_Exercise/Naveen_Selenium_Training/drivers/geckoDriver/geckodriver");
		driver = new FirefoxDriver();
	}
	else {
		System.out.println("Browser didn't find. please provide one of those broswrer");
	}
	return driver;
}
	/**
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchUrl(WebDriver driver, String url ) {
		try {
			driver.get(url);
		}
		catch ( Exception e) {
			System.out.println("Please provide correct url");
		}
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void validsendKeys(WebDriver driver,By locator, String value) 
	{
		getElement(driver,locator).sendKeys(value);
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void doClick(WebDriver driver,By locator) {
		
		getElement(driver, locator).click();
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String  dogetText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}
	/**
	 * 
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		try {
			driver.quit();
		} catch(Exception e)
		{
			System.out.println("browser couldn't close; some problem happend.");
		}
	}


}
