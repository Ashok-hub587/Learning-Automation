package assignments;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentRegistarationForm {
	public static void main(String[] args) {

		// Pre step: Automatic Driver download and Setup
		WebDriverManager.chromedriver().setup();

		// Step 1: Initialize WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to web page Via URL
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		// Verify the page
		String expected_Title = "Selenium Practice - Student Registration Form";
		String actual_Title = driver.getTitle();
		//System.out.println(actual_Title);

		if (expected_Title.equals(actual_Title)) {
			System.out.println("Title Verified :Test pass");
			System.out.println();
		} else {
			System.out.println("Title Verified :Test fail");
			System.out.println();
		}

		// Verify and Validate Web Elements
		// First name
		WebElement firstName_Textfield = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		System.out.println("Name Textfield is displayed: " + firstName_Textfield.isDisplayed());
		System.out.println();
		System.out.println("Name Textfield is Enabled: " + firstName_Textfield.isEnabled());
		System.out.println();

		// Email Textfield
		WebElement email_Textfield = driver.findElement(By.cssSelector("#email"));
		System.out.println("Email Textfield is displayed: " + email_Textfield.isDisplayed());
		System.out.println();
		System.out.println("Email Textfield is Enabled: " + email_Textfield.isEnabled());
		System.out.println();

		// Male Radio button
		WebElement male_Radiobutton = driver.findElement(By.xpath("//input[@name='gender']"));
		System.out.println("Male Radio button is displayed: " + male_Radiobutton.isDisplayed());
		System.out.println();
		System.out.println("Male Radio button is Enabled: " + male_Radiobutton.isEnabled());
		System.out.println();

		// Mobile number Text field
		WebElement mobileNum_Textfield = driver.findElement(By.id("mobile"));
		System.out.println("Mobile number Text field is displayed: " + mobileNum_Textfield.isDisplayed());
		System.out.println();
		System.out.println("Mobile number Text field is Enabled: " + mobileNum_Textfield.isEnabled());
		System.out.println();

		// subjects Text field
		WebElement subjects_Textfield = driver.findElement(By.id("subjects"));
		System.out.println("subjects Text field is displayed: " + subjects_Textfield.isDisplayed());
		System.out.println();
		System.out.println("subjects Text field is Enabled: " + subjects_Textfield.isEnabled());
		System.out.println();

		// Reading checkbox
		WebElement reading_checkbox = driver
				.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input[@type=\"checkbox\"]"));
		System.out.println("Reading checkbox is displayed: " + reading_checkbox.isDisplayed());
		System.out.println();
		System.out.println("Reading checkbox is Enabled: " + reading_checkbox.isEnabled());
		System.out.println();

		// Choose button
		WebElement choose_button = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		System.out.println("Choose button is displayed: " + choose_button.isDisplayed());
		System.out.println();
		System.out.println("Choose button is Enabled: " + choose_button.isEnabled());
		System.out.println();

		// Address Text field
		WebElement address_Textfield = driver.findElement(By.xpath("//textarea[@placeholder=\"Currend Address\"]"));
		System.out.println("Address Text field is displayed: " + address_Textfield.isDisplayed());
		System.out.println();
		System.out.println("Address Text field is Enabled: " + address_Textfield.isEnabled());
		System.out.println();

		// State Dropdown
		WebElement state_Dropdown = driver.findElement(By.id("state"));
		System.out.println("State Dropdown is displayed: " + state_Dropdown.isDisplayed());
		System.out.println();
		System.out.println("State Dropdown is Enabled: " + state_Dropdown.isEnabled());
		System.out.println();

		// City Dropdown
		WebElement city_Dropdown = driver.findElement(By.id("city"));
		System.out.println("city Dropdown is displayed: " + city_Dropdown.isDisplayed());
		System.out.println();
		System.out.println("city Dropdown is Enabled: " + city_Dropdown.isEnabled());
		System.out.println();

		// Login button
		WebElement login_button = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
		System.out.println("Choose button is displayed: " + login_button.isDisplayed());
		System.out.println();
		System.out.println("Choose button is Enabled: " + login_button.isEnabled());
		System.out.println();

		// Click on elements/Give input into Elemenets
		firstName_Textfield.sendKeys("Ramana");
		email_Textfield.sendKeys("ramanadenturi65@gmail.com");
		male_Radiobutton.click();
		System.out.println("Male radio button is selected " + male_Radiobutton.isSelected());
		System.out.println();
		mobileNum_Textfield.sendKeys("5942368902");
		subjects_Textfield.sendKeys("Mathematics");
		reading_checkbox.click();
		System.out.println("Reading checkbox is selected " + reading_checkbox.isSelected());
		System.out.println();
		
		File fileObj = new File("./data/Notes.txt");
		String absolutePath = fileObj.getAbsolutePath();
		choose_button.sendKeys(absolutePath);
		
		address_Textfield.sendKeys("Dadranagar,Mumbai");
		Select stateObj = new Select(state_Dropdown);
		stateObj.selectByIndex(4);
		Select cityObj = new Select(city_Dropdown);
		cityObj.selectByVisibleText("Agra");
		login_button.click();
		

	}
}
