package basicSelenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseinputDemoLaunch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser Name");
		String browserName = sc.next();
		
		//Close the Scanner object
		sc.close();

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			new EdgeDriver();
			
		} else
			System.out.println("Please Enter Valid browser");
		
	}
}
