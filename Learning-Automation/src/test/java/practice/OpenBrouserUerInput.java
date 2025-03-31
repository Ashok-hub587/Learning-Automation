package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrouserUerInput {
	public static void main(String[] args) throws InterruptedException {

		// import Scanner class properties
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Browser Name");
		String browserName = scan.next();

		//Dreclare driver variable
		WebDriver driver=null;
		
		// Configure the browser & Launch the browser
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
		} else {
			System.out.println("Enter Valid browser Name");
		}

		// Close the browser if it's initialized
		if (driver != null) {
			Thread.sleep(2000);
			driver.quit();
		}
		
		//Close the scanner object
		scan.close();
	}
}
