package handlingMultipleElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleElements {
	public static void main(String[] args) {
		// Configure the web driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		// Navigate To Url
		driver.get("https://www.amazon.in/");
		//Idenify 
		

	}
}
