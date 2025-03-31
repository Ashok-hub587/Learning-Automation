package handlingPoPups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNotificationPoPup {

	public static void main(String[] args) throws InterruptedException {

		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);

		// Navigate to Application
		driver.get("https://www.easemytrip.com/");
		
		Actions actionObj=new Actions(driver);
		
		actionObj.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		
		actionObj.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		
		actionObj.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		
		driver.quit();
	}
}
