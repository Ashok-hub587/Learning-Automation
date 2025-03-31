package handlingPoPups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningAuthenticationPOPup {

	public static void main(String[] args) {

		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Customize The URL
		String uname = "admin";
		String pswd = "admin";

		String custom_url = "https://" + uname + ":" + pswd + "@" + "the-internet.herokuapp.com/basic_auth";

		// Navigate to Application
		driver.get(custom_url);

	}
}
