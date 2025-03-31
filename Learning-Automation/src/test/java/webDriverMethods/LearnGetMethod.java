package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Learning how to Navigate to the Application Via URL*/
public class LearnGetMethod {
	public static void main(String[] args) {

		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Step2:Navigate to the Application Via URL
		driver.get("https://www.saucedemo.com");
		
		//Close the Browser
		driver.quit();
	}
}
