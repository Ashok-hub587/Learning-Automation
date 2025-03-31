package javaScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningHandlingDisabledElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationexercise.com/login");

		WebElement name_Tetfield = driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));

		WebElement email_Tetfield = driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));

		WebElement signup_Button = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));

		name_Tetfield.sendKeys("Vinod");

		email_Tetfield.sendKeys("ylgyeg65@gmail.com");

		signup_Button.click();
		
		//-------Steps to handle Disabled elements----------------//
		
		//1. Identify the disabled element
		WebElement email_textfield = driver.findElement(By.xpath("//input[@data-qa=\"email\"]"));
		
		System.out.println("Email textfield element is enabled: "+email_textfield.isEnabled());
		
		String jscode="arguments[0].value='ylgyeg66@gmail.com'";
		
		//2.Perform Type casting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//3.Call the abstract method --- To Execute JS code
		js.executeScript(jscode, email_textfield);
		
		Thread.sleep(3000);
		
		driver.close();

	}
}
