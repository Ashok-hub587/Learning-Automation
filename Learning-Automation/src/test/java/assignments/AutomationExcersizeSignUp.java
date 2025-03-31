package assignments;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*To Verify User Able To Create An Acccount in Automation Excersize*/
public class AutomationExcersizeSignUp {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser");
		String browser = sc.next();

		// Close the Scanner
		sc.close();

		// Declare a driver Variable
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter Valid Browser");
		}

		//Maximize the Browser
		driver.manage().window().maximize();
		
		// Home page
		driver.get("https://www.automationexercise.com/");
		WebElement Signup_Login = driver.findElement(By.xpath("//a[@href=\"/login\"]"));// xpath using Full Attribute
																						// value
		Signup_Login.click();
		// Signup_Login page
		WebElement name_textfield = driver.findElement(By.name("name"));// Locator by name
		WebElement email_textfield = driver
				.findElement(By.xpath("//button[text()='Signup']/preceding::input[@data-qa=\"signup-email\"]"));// xpath
																												// Axes
																												// by
																												// preceeding
		WebElement signup_button = driver.findElement(By.xpath("//button[text()='Signup']"));// xpath by using full text
		name_textfield.sendKeys("Tinaut");
		email_textfield.sendKeys("beyeuauhah@gmail.com");
		signup_button.click();
		// Step4: Capture Account Information Elements
		WebElement mr = driver.findElement(By.id("id_gender1"));// xpath by using id
		WebElement password_textfield = driver.findElement(By.xpath("//input[contains(@data-qa,\"pass\")]"));// xpath by
																												// using
																												// partial
																												// attribute
																												// value
		WebElement newsletter_checkbox = driver
				.findElement(By.xpath("//div[@class=\"checkbox\"]/child::div/child::span/input[@id=\"newsletter\"]"));// xpath
																														// by
																														// using
																														// axes
																														// child
		WebElement offers_checkbox = driver.findElement(
				By.xpath("//div[@class=\"checkbox\"]/following-sibling::div/div/span/input[@id=\"optin\"]"));// xpatht
																												// axes
																												// forward
																												// sibling
		WebElement firstnameTextfield = driver
				.findElement(By.xpath("//input[@data-qa=\"first_name\" and @type=\"text\"]"));// xpath using special
																								// operator
		WebElement lastname_textfield = driver
				.findElement(By.xpath("//input[@name=\"last_name\" or @data-qa=\"last_name\"]"));// xpath using special
																									// operator
		WebElement address_textfield = driver
				.findElement(By.xpath("//input[@data-qa=\"last_name\"]/following::input[@name=\"address1\"]"));// xpath
																												// using
																												// following
		WebElement state_textfield = driver
				.findElement(By.xpath("//input[@name=\"address1\"]/../following-sibling::p[3]/input"));// xpath by
																										// dependency
		WebElement city_textfield = driver.findElement(By.cssSelector("input[name=\"city\"]"));// Locator Using CSS
																								// Selector Attribute
		WebElement zipcode_textfield = driver.findElement(By.cssSelector("#zipcode"));// Locator Using cssSelector id
		WebElement mobilenumber_textfield = driver.findElement(
				By.xpath("//button[@class=\"btn btn-default\"]/preceding::input[@data-qa=\"mobile_number\"]"));// xpath
																												// by
																												// using
																												// axes
																												// preceeding
		WebElement createaccount_button = driver.findElement(By.xpath("//button[contains(text(),'Account')]"));// xpath
																												// by
																												// using
																												// partial
																												// text
		// xpath using Axes parent is not used
		// Step5: Fill Account Information
		mr.click();
		password_textfield.sendKeys("tktgyg@y7");
		newsletter_checkbox.click();
		offers_checkbox.click();
		firstnameTextfield.sendKeys("naya");
		lastname_textfield.sendKeys("jawan");
		address_textfield.sendKeys("mumbai");
		state_textfield.sendKeys("MH");
		city_textfield.sendKeys("mumbai");
		zipcode_textfield.sendKeys("526635");
		mobilenumber_textfield.sendKeys("8632563658");
		Thread.sleep(5000);
		createaccount_button.submit();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
}
