package com.Naveen_Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.crmpro.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign Up")).click();
		
		Select edition = new Select(driver.findElement(By.className("input-text")));
		edition.selectByValue("Free Edition");
		edition.selectByIndex(1);
		driver.findElement(By.name("first_name")).sendKeys("John");
		driver.findElement(By.name("surname")).sendKeys("Abraham");
		driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("test123@gmail.com");
		driver.findElement(By.name("username")).sendKeys("automation2019");
		driver.findElement(By.name("password")).sendKeys("test342");
		driver.findElement(By.name("passwordconfirm")).sendKeys("test342");
		driver.findElement(By.name("agreeTerms")).click();
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		

	}

}
