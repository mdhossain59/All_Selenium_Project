package com.Naveen_Selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.coursera.org/");
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(" Title of the page is :" +title);
		driver.findElement(By.xpath("//input[@placeholder='What do you want to learn?']"));
		driver.findElement(By.xpath("//body/div[@id='rendered-content']/div[@class='rc-MetatagsWrapper']/div[@class='rc-FrontPageApplication']/span/div/header[@class='rc-PageHeaderControls']/div[@class='smart-scroll-container']/div[@class='SmartScrollWrapper_1g73uxh']/div[@class='rc-PageHeader']/div[@class='bt3-navbar c-ph-nav full-width bt3-navbar-fixed-top']/div[@class='c-container bt3-container-fluid']/div[@class='c-ph-search-catalog nav-item horizontal-box browse-search']/div[@class='browse-header-wrapper horizontal-box']/div[@class='rc-SearchBar horizontal-box']/form[@class='search-form']/div[@class='ais-InstantSearch__root']/div/div[@class='rc-AutoComplete horizontal-box']/button[@class='nostyle search-button']/div[@class='magnifier-wrapper']/*[1]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		
	}

}
