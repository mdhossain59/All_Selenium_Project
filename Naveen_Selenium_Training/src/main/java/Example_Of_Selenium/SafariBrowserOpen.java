package Example_Of_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserOpen {
	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new SafariDriver();
		driver.get("https://twitter.com/");
		String title = driver.getTitle();
		System.out.println("Tittle of twitter is: "+title);
		
		if (title.equals(title)) {
			System.out.println(" Test case is passed");
			
		}
		else {
			System.out.println(" test case failed");
		}
		
		driver.close();
	}

}
