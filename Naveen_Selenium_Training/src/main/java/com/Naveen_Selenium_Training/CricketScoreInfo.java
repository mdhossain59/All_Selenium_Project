package com.Naveen_Selenium_Training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreInfo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19430/scorecard/1152850/england-vs-australia-5th-test-icc-world-test-championship-2019-2021");
		driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
	List <WebElement> scoreList = driver.findElements(By.xpath("//a[text]( )=\"BA Stokes\"]//parent::div//following-sibling::div[@class='cells run']"));
	
	for (int i = 0; i <=scoreList.size()-6; i++) {
		
		String score = scoreList.get(i).getText();
		
		System.out.println(score+ "\t");
		
	}
		
	
		

	}

}
