package learningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnName {
public static void main(String[] args) throws InterruptedException {
	// pre-step1: Configure the browser
			WebDriverManager.chromedriver().setup();

			// Step1: Launch the Browser---Chrome
			WebDriver driver = new ChromeDriver();

			// Maximize the Browser
			driver.manage().window().maximize();

			// Navigate to Application1
			driver.get("https://www.saucedemo.com/");

			// Step2: Verify the page
			String expected_title = "Swag Labs";
			String actual_title = driver.getTitle();
			if (expected_title.equals(actual_title)) {
				System.out.println("Title verified: Test pass");
			} else
				System.out.println("Title verified: Test fail");

			// step3: Identify element and store it
			WebElement username_textfield =driver.findElement(By.name("user-name"));
			
			WebElement password_textfield=driver.findElement(By.name("password"));
			
			WebElement login_button=driver.findElement(By.name("login-button"));
			
			//Step4: Validate the element
			boolean result=username_textfield.isDisplayed();
			System.out.println("Element is Displayed "+result);
			
			boolean result1=password_textfield.isDisplayed();
			System.out.println("Element is Displayed "+result1);
			
			boolean result2=login_button.isDisplayed();
			System.out.println("Element is Displayed "+result2);

			//Step5:Perfoem Action
			username_textfield.sendKeys("standard_user");
			
			password_textfield.sendKeys("secret_sauce");
			
			login_button.click();
			
			Thread.sleep(2000);
			driver.close();
}
}
