package learningLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
		String expect_Title = "Automation Exercise";
		String actual_Title = driver.getTitle();
		//System.out.println("Current page title is : " + actual_Title);
		if (expect_Title.equals(actual_Title)) {
			System.out.println("Application is Verified");
		} else {
			System.out.println("Application is not verified");
		}
		driver.close();

	}
}
