package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcersiseSignup1 {
	public static void main(String[] args) throws InterruptedException {
		
		// Pre step: Automatic Driver download and Setup
		WebDriverManager.chromedriver().setup();

		// Step 1: Initialize WebDriver instance
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to web page Via URL
		driver.get("https://www.automationexercise.com/");

		// Step2: Validating the signup_Login Linktext
		WebElement Signup_Login = driver.findElement(By.xpath("//a[@href=\"/login\"]"));// xpath using Full Attribute
																						// value
		boolean result1 = Signup_Login.isDisplayed();
		boolean result2 = Signup_Login.isEnabled();
		if (result1 && result2) {
			System.out.println("Signup_Login Button is Displayed " + result1);
			System.out.println("Signup_Login Button is Enabled " + result2);
		} else {
			System.out.println("Signup_Login Button is Displayed " + result1);
			System.out.println("Signup_Login Button is Enabled " + result2);
		}
		// Step3: Click on Signup_Login Linktext
		Signup_Login.click();

		// Step4 : Verify if Navigated To Page
		String expected_Text = "Automation Exercise - Signup / Login";
		String actual_text = driver.getTitle();
		System.out.println(actual_text);
		if (expected_Text.equals(actual_text)) {
			System.out.println("Title Verified: Test Pass");
		} else {
			System.out.println("Title Verified: Test fail");
		}

		// Step 5: Validate The Name textfiled,Email Address text field,Sign up button
		// Name textfield
		WebElement name_textfield = driver.findElement(By.name("name"));// Locator by name
		boolean result3 = name_textfield.isDisplayed();
		boolean result4 = name_textfield.isEnabled();
		if (result3 && result4) {
			System.out.println("Name textfield is Displayed " + result3);
			System.out.println("Name textfield is Enabled " + result4);
		} else {
			System.out.println("Name textfield is Displayed " + result3);
			System.out.println("Name textfield is Enabled " + result4);
		}
		// Email Address text field
		WebElement email_textfield = driver
				.findElement(By.xpath("//button[text()='Signup']/preceding::input[@data-qa=\"signup-email\"]"));// xpath
																												// Axes
																												// by
																												// preceeding
		boolean result5 = email_textfield.isDisplayed();
		boolean result6 = email_textfield.isEnabled();
		if (result5 && result6) {
			System.out.println("Email Address textfield is Displayed " + result5);
			System.out.println("Email Address textfield is Enabled " + result6);
		} else {
			System.out.println("Email Address textfield is Displayed " + result5);
			System.out.println("Email Address textfield is Enabled " + result6);
		}

		// Signup Button
		WebElement signup_button = driver.findElement(By.xpath("//button[text()='Signup']"));// xpath by using full text
		boolean result7 = signup_button.isDisplayed();
		boolean result8 = signup_button.isEnabled();
		if (result5 && result6) {
			System.out.println("SignUp button is Displayed " + result7);
			System.out.println("SignUp button textfield is Enabled " + result8);
		} else {
			System.out.println("SignUp button is Displayed " + result7);
			System.out.println("SignUp button is Enabled " + result8);
		}

		// Step 6: Enter Name into Name Textfield,Email into Email textfield,click on
		// signup button
		name_textfield.sendKeys("Tinaut");
		email_textfield.sendKeys("beyeuauha@gmail.com");
		signup_button.click();

		// Step7: Verify if Navigated To Page
		String expected_Text1 = "Automation Exercise - Signup";
		String actual_text1 = driver.getTitle();
		System.out.println(actual_text1);
		if (expected_Text1.equals(actual_text1)) {
			System.out.println("Title Verified: Test Pass");
		} else {
			System.out.println("Title Verified: Test fail");
		}

		// Step8: Validate The all Signup form Elements
		WebElement mr = driver.findElement(By.id("id_gender1"));// xpath by using id
		boolean result9 = mr.isDisplayed();
		boolean result10 = mr.isEnabled();
		if (result9 && result10) {
			System.out.println("mr radio button is Displayed " + result9);
			System.out.println(" mr radio button is Enabled " + result10);
		} else {
			System.out.println("mr radio button is Displayed " + result9);
			System.out.println("mr radio button is Enabled " + result10);
		}

		WebElement password_textfield = driver.findElement(By.xpath("//input[contains(@data-qa,\"pass\")]"));// xpath by
																												// using
																												// partial
																												// attribute
																												// value
		boolean result11 = password_textfield.isDisplayed();
		boolean result12 = password_textfield.isEnabled();
		if (result11 && result12) {
			System.out.println("password_textfield is Displayed " + result11);
			System.out.println("password_textfield is Enabled " + result12);
		} else {
			System.out.println("password_textfield is Displayed " + result11);
			System.out.println("password_textfield is Enabled " + result12);
		}

		WebElement day_dropdown = driver.findElement(By.id("days"));

		boolean result36 = day_dropdown.isDisplayed();
		boolean result37 = day_dropdown.isEnabled();
		if (result36 && result37) {
			System.out.println("day dropdown is displayed " + result36);
			System.out.println("Day dropdown is Enabled " + result37);
		} else {
			System.out.println("day dropdown is displayed " + result36);
			System.out.println("Day dropdown is Enabled " + result37);
		}

		WebElement month_dropdown = driver.findElement(By.id("months"));

		boolean result38 = month_dropdown.isDisplayed();
		boolean result39 = month_dropdown.isEnabled();
		if (result38 && result39) {
			System.out.println("Month dropdown is displayed " + result38);
			System.out.println("Month dropdown is Enabled " + result39);
		} else {
			System.out.println("Month dropdown is displayed " + result38);
			System.out.println("Month dropdown is Enabled " + result39);
		}

		WebElement year_dropdown = driver.findElement(By.id("years"));

		boolean result40 = year_dropdown.isDisplayed();
		boolean result41 = year_dropdown.isEnabled();
		if (result40 && result41) {
			System.out.println("Year dropdown is displayed " + result40);
			System.out.println("Year dropdown is Enabled " + result41);
		} else {
			System.out.println("Year dropdown is displayed " + result40);
			System.out.println("Year dropdown is Enabled " + result41);
		}

		WebElement newsletter_checkbox = driver
				.findElement(By.xpath("//div[@class=\"checkbox\"]/child::div/child::span/input[@id=\"newsletter\"]"));// xpath by using axes child
		
		boolean result13 = newsletter_checkbox.isDisplayed();
		boolean result14 = newsletter_checkbox.isEnabled();
		if (result13 && result14) {
			System.out.println("newsletter_checkbox is Displayed " + result13);
			System.out.println("newsletter_checkbox is Enabled " + result14);
		} else {
			System.out.println("newsletter_checkbox is Displayed " + result13);
			System.out.println("newsletter_checkbox is Enabled " + result14);
		}

		WebElement offers_checkbox = driver.findElement(
				By.xpath("//div[@class=\"checkbox\"]/following-sibling::div/div/span/input[@id=\"optin\"]"));// xpatht axes forward sibling
		
		boolean result15 = offers_checkbox.isDisplayed();
		boolean result16 = offers_checkbox.isEnabled();
		if (result15 && result16) {
			System.out.println("newsletter_checkbox is Displayed " + result15);
			System.out.println("newsletter_checkbox is Enabled " + result16);
		} else {
			System.out.println("newsletter_checkbox is Displayed " + result15);
			System.out.println("newsletter_checkbox is Enabled " + result16);
		}

		WebElement firstnameTextfield = driver
				.findElement(By.xpath("//input[@data-qa=\"first_name\" and @type=\"text\"]"));// xpath using special
																								// operator
		boolean result17 = firstnameTextfield.isDisplayed();
		boolean result18 = firstnameTextfield.isEnabled();
		if (result17 && result18) {
			System.out.println("name_textfield is Displayed " + result17);
			System.out.println("name_textfield is Enabled " + result18);
		} else {
			System.out.println("name_textfield is Displayed " + result17);
			System.out.println("name_textfield is Enabled " + result18);
		}

		WebElement lastname_textfield = driver
				.findElement(By.xpath("//input[@name=\"last_name\" or @data-qa=\"last_name\"]"));// xpath using special
																									// operator
		boolean result19 = lastname_textfield.isDisplayed();
		boolean result20 = lastname_textfield.isEnabled();
		if (result19 && result20) {
			System.out.println("lastname_textfield is Displayed " + result19);
			System.out.println("lastname_textfield is Enabled " + result20);
		} else {
			System.out.println("lastname_textfield is Displayed " + result19);
			System.out.println("lastname_textfield is Enabled " + result20);
		}

		WebElement address_textfield = driver
				.findElement(By.xpath("//input[@data-qa=\"last_name\"]/following::input[@name=\"address1\"]"));// xpath
																												// using
																												// following
		boolean result21 = address_textfield.isDisplayed();
		boolean result22 = address_textfield.isEnabled();
		if (result21 && result22) {
			System.out.println("address_textfield is Displayed " + result21);
			System.out.println("address_textfield is Enabled " + result22);
		} else {
			System.out.println("address_textfield is Displayed " + result21);
			System.out.println("address_textfield is Enabled " + result22);
		}

		WebElement country_dropdown = driver.findElement(By.xpath("//select[@data-qa=\"country\"]"));
		boolean result42 = country_dropdown.isDisplayed();
		boolean result43 = country_dropdown.isEnabled();
		if (result42 && result43) {
			System.out.println("Country dropdown is displayed " + result42);
			System.out.println("Country dropdown is displayed " + result43);
		} else {
			System.out.println("Country dropdown is displayed " + result42);
			System.out.println("Country dropdown is displayed " + result43);
		}

		WebElement state_textfield = driver
				.findElement(By.xpath("//input[@name=\"address1\"]/../following-sibling::p[3]/input"));// xpath by
																										// dependency
		boolean result23 = state_textfield.isDisplayed();
		boolean result24 = state_textfield.isEnabled();
		if (result23 && result24) {
			System.out.println("state_textfield is Displayed " + result23);
			System.out.println("state_textfield is Enabled " + result24);
		} else {
			System.out.println("state_textfield is Displayed " + result23);
			System.out.println("state_textfield is Enabled " + result24);
		}

		WebElement city_textfield = driver.findElement(By.cssSelector("input[name=\"city\"]"));// Locator Using CSS
																								// Selector Attribute
		boolean result25 = city_textfield.isDisplayed();
		boolean result26 = city_textfield.isEnabled();
		if (result25 && result26) {
			System.out.println("city_textfield is Displayed " + result25);
			System.out.println("city_textfield is Enabled " + result26);
		} else {
			System.out.println("city_textfield is Displayed " + result25);
			System.out.println("city_textfield is Enabled " + result26);
		}

		WebElement zipcode_textfield = driver.findElement(By.cssSelector("#zipcode"));// Locator Using cssSelector id
		boolean result27 = zipcode_textfield.isDisplayed();
		boolean result28 = zipcode_textfield.isEnabled();
		if (result27 && result28) {
			System.out.println("zipcode_textfield is Displayed " + result27);
			System.out.println("zipcode_textfield is Enabled " + result28);
		} else {
			System.out.println("zipcode_textfield is Displayed " + result27);
			System.out.println("zipcode_textfield is Enabled " + result28);
		}

		WebElement mobilenumber_textfield = driver.findElement(
				By.xpath("//button[@class=\"btn btn-default\"]/preceding::input[@data-qa=\"mobile_number\"]"));// xpath
																												// by
																												// using
																												// axes
																												// preceeding
		boolean result29 = mobilenumber_textfield.isDisplayed();
		boolean result30 = mobilenumber_textfield.isEnabled();
		if (result29 && result30) {
			System.out.println("mobilenumber_textfield is Displayed " + result29);
			System.out.println("mobilenumber_textfield is Enabled " + result30);
		} else {
			System.out.println("mobilenumber_textfield is Displayed " + result29);
			System.out.println("mobilenumber_textfield is Enabled " + result30);
		}
		WebElement createaccount_button = driver.findElement(By.xpath("//button[contains(text(),'Account')]"));// xpath
																												// by
																												// using
																												// partial
																												// text
		boolean result31 = createaccount_button.isDisplayed();
		boolean result32 = createaccount_button.isEnabled();
		if (result31 && result32) {
			System.out.println("createaccount_button is Displayed " + result31);
			System.out.println("createaccount_button is Enabled " + result32);
		} else {
			System.out.println("createaccount_button is Displayed " + result31);
			System.out.println("createaccount_button is Enabled " + result32);
		}

		// Step5: Fill Account Information

		mr.click();
		boolean result33 = mr.isSelected();
		if (result33) {
			System.out.println("mr radio_button is selected : " + result33);
		} else {
			System.out.println("mr radio_button is selected : " + result33);
		}

		password_textfield.sendKeys("tktgyg@y7");

		newsletter_checkbox.click();
		boolean result34 = newsletter_checkbox.isSelected();
		if (result34) {
			System.out.println("newsletter_checkbox is selected : " + result34);
		} else {
			System.out.println("newsletter_checkbox is selected : " + result34);
		}

		offers_checkbox.click();
		boolean result35 = offers_checkbox.isSelected();
		if (result35) {
			System.out.println("offers_checkbox is selected : " + result35);
		} else {
			System.out.println("offers_checkbox is selected : " + result35);
		}

		Select dayObj = new Select(day_dropdown);
		dayObj.selectByValue("1");
		Select monthObj = new Select(month_dropdown);
		monthObj.selectByVisibleText("April");
		Select yearObj = new Select(year_dropdown);
		yearObj.selectByIndex(2);
		firstnameTextfield.sendKeys("naya");
		lastname_textfield.sendKeys("jawan");
		address_textfield.sendKeys("mumbai");
		Select countryObj = new Select(country_dropdown);
		countryObj.selectByValue("Israel");
		state_textfield.sendKeys("MH");
		city_textfield.sendKeys("mumbai");
		zipcode_textfield.sendKeys("526635");
		mobilenumber_textfield.sendKeys("8632563658");
		Thread.sleep(5000);
		// createaccount_button.submit();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
}
