package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest2 {
	public static void main(String[] args) {
		// Configure the Driver Executable file Chrome
		WebDriverManager.chromedriver().setup();
		// Step1: Launch the Browser Chrome
		ChromeDriver driver = new ChromeDriver();
		driver.close();
	}
}
