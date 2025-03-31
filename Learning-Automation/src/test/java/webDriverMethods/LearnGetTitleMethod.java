package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGetTitleMethod {
	public static void main(String[] args) {

		// pre-step:Configure the Web Browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate to the Application Via URL
		driver.get("https://www.saucedemo.com/");

		// Fetch THE TITLE
		String expect_title = "Swag Labs";
		String actual_title = driver.getTitle();
		System.out.println("Title is " + expect_title);

		// Step2.1: Verify page Using Title
		if (expect_title.equals(actual_title)) {
			System.out.println("Title Verified: Test pass");
		} else
			System.out.println("Title Verified: Test fail");
		
		//Wait statement
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Close the Browser
		driver.quit();
	}
}
