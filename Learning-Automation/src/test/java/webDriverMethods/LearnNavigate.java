package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNavigate {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Navigate to Application1
		driver.get("https://pistahouse.in/");

		Thread.sleep(5000);

		// Navigate to Application2
		driver.navigate().to("https://www.rapido.bike/");

		Thread.sleep(5000);

		// Navigate to Application3
		driver.navigate().to(new URL("https://online.kfc.co.in/"));

		Thread.sleep(5000);

		// perform backward Navigation to 2nd Application
		driver.navigate().back();

		Thread.sleep(5000);

		// Perfom Relaod Navigation
		driver.navigate().refresh();

		Thread.sleep(5000);

		// perform Forward Navigation to 3rd Application
		driver.navigate().forward();

		Thread.sleep(5000);

		// Close the browser
		driver.quit();
	}
}
