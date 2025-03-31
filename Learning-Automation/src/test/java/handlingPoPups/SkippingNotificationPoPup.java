package handlingPoPups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkippingNotificationPoPup {
	public static void main(String[] args) throws InterruptedException {

		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Customize The browser settings
		ChromeOptions option=new ChromeOptions();
		
		//1.Disable the Notification
		option.addArguments("--disable-notifications");

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver(option);

		// Maximize the Browser
		driver.manage().window().maximize();

		// Navigate to Application
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(3000);
		
		driver.close();

	}
}
