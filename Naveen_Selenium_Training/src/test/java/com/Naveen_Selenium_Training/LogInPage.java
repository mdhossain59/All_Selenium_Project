package com.Naveen_Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	
	public static void main(String[] args) throws InterruptedException {
		String browser = "firefox";
		String url = "https://www.facebook.com/";
		
		By userId =By.id("email");
		By pwd = By.id("pass");
		By logInButton = By.id("u_0_2");
		By logInError = By.id("error_box");
		
		WebDriver driver = Util_for_Project.initDriver(browser);
		Util_for_Project.launchUrl(driver, url);
		
		
		Util_for_Project.validsendKeys(driver, userId, "test754@gmail.com");
		Util_for_Project.validsendKeys(driver, pwd, "test2019");
		Util_for_Project.doClick(driver, logInButton);
		
		
		String errorText = Util_for_Project.dogetText(driver, logInError);
		System.out.println(errorText);
		if (errorText.equals("Please Confirm Password")) 
		{
		System.out.println("Please provide valid email or password");
		}
		else {
		System.out.println(" Incorret error message");
		}
		
		Util_for_Project.quitBrowser(driver);
	}
}
