package com.Naveen_Selenium_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author mdhossain
 *
 */
public class TestNGTest {
	public static void main(String[] args) {
		WebDriver driver;
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();	
		driver.get("https://www.facebook.com");
		String str = driver.getCurrentUrl();
		System.out.println("Tittle of the website: "+str);
		driver.close();
	}


	 


}
