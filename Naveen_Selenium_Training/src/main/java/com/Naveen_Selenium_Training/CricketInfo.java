package com.Naveen_Selenium_Training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author mdhossain
 *
 */
public class CricketInfo {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "/Users/mdhossain/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.espncricinfo.com/series/19315/scorecard/1187005/india-vs-south-africa-2nd-t20i-south-africa-in-india-2019-20");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getPlayerBlowingScore(driver, "Q de Kock (c) †");

	}
	public static void getPlayerBlowingScore(WebDriver driver, String playerName) {
		
		System.out.println();
		List<WebElement> blowingList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::div//following-sibling::div[@class='cell runs']"));
		
		for (int i = 0; i < blowingList.size()-6; i++) {
			String over = blowingList.get(i).getText();
			System.out.print(over+ "\t");
			
		}
	}	
	
}
