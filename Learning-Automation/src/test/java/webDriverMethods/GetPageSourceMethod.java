package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		
		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();
		
		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();
		
		//step2:Navigate to the application via URL
		driver.get("https://www.saucedemo.com/");
		
		//Fetch the page source code and print on console
		System.out.println(driver.getPageSource());
		
		//Wait Statement
		Thread.sleep(2000);
		
		//close the Browser
		driver.close();
	}
}
