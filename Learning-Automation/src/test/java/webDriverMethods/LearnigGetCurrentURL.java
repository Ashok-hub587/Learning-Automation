package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnigGetCurrentURL {
	public static void main(String[] args) throws InterruptedException {
		
		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();
		
		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();
		
		// Step2:Navigate to the Application Via URL
		driver.get("https://www.saucedemo.com/");
		
		//Fetch the page URL and print on console
		String expect_url = "https://www.saucedemo.com/";
		String actual_url = driver.getCurrentUrl();
		System.out.println("Current URL IS "+ actual_url);
		
		//Verify Page using URL
		if (expect_url.equals(actual_url)) {
			System.out.println("URL Verified: Pass");
		} else
			System.out.println("URL Verified: Fail");
		
		//wait statement
		Thread.sleep(5000);
		
		//close browser
		driver.quit();
	}
}
