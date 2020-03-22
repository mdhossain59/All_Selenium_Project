package com.Naveen_Selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserLaunch {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		
			driver.get("http://www.google.com");
			
		String title = driver.getTitle();
		System.out.println(" Title of google: "+title);
		driver.findElement(By.name("q")).sendKeys("http://www.facebook.com");
		
		driver.findElement(By.name("btnK")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.close();
		
		

	}

}
