package assignments;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//This program is written to test User Can Remove a Product From Cart In SauceDemo Web App
public class RemoveProductFromCart {
	public static void main(String[] args) {
		// Taking Brower input from User
		Scanner scan = new Scanner(System.in);
		System.out.println("Ener the browser name");
		String browserName = scan.next();

		// Declare product Variable
		System.out.println("Enter Product Number");
		String productNum = scan.next();

		// Close Scanner Class object
		scan.close();

		// Declare driver variable
		WebDriver driver = null;

		// Step 1: Launch the Browser and Maximize
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else
			System.out.println("Enter Valid browser");

		// Maximize the browser
		driver.manage().window().maximize();

		// Provide explicite wait
		 WebDriverWait wait = new WebDriverWait(driver, 20l);

		// Navigate to Url
		driver.get("https://www.saucedemo.com/");

		// Verify if Swags Labs Login page is displayed
		String expected_URL = "https://www.saucedemo.com/";
		String actual_URL = driver.getCurrentUrl();
		if (expected_URL.equals(actual_URL)) {
			System.out.println("URL Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("URL Verified: Test fail");
			System.out.println();
		}

		// Verify The elements is displayed and enabled
		WebElement username_Textfield = driver.findElement(By.id("user-name"));
		WebElement password_Textfield = driver.findElement(By.id("password"));
		WebElement login_Button = driver.findElement(By.id("login-button"));

		// Validate username_Textfield
		Boolean result1 = username_Textfield.isDisplayed();
		Boolean result2 = username_Textfield.isEnabled();
		if (result1 && result2) {
			System.out.println("username_Textfield is displayed : " + result1);
			System.out.println();
			System.out.println("username_Textfield is enabled : " + result2);
			System.out.println();
		} else {
			System.out.println("username_Textfield is displayed : " + result1);
			System.out.println();
			System.out.println("username_Textfield is enabled : " + result2);
			System.out.println();
		}

		// Validate password_Textfield
		Boolean result3 = password_Textfield.isDisplayed();
		Boolean result4 = password_Textfield.isEnabled();
		if (result3 && result4) {
			System.out.println("password_Textfield is displayed : " + result3);
			System.out.println();
			System.out.println("password_Textfield is enabled : " + result4);
			System.out.println();
		} else {
			System.out.println("password_Textfield is displayed : " + result3);
			System.out.println();
			System.out.println("password_Textfield is enabled : " + result4);
			System.out.println();
		}

		// Validate login_Button
		Boolean result5 = login_Button.isDisplayed();
		Boolean result6 = login_Button.isEnabled();
		if (result5 && result6) {
			System.out.println("login_Button is displayed : " + result5);
			System.out.println();
			System.out.println("login_Button is enabled : " + result6);
			System.out.println();
		} else {
			System.out.println("login_Button is displayed : " + result5);
			System.out.println();
			System.out.println("login_Button is enabled : " + result6);
			System.out.println();
		}

		// Step2: Enter data And click Login
		username_Textfield.sendKeys("standard_user");
		password_Textfield.sendKeys("secret_sauce");
		login_Button.click();

		// Verify if Navigated Products page
		String expected_URL1 = "https://www.saucedemo.com/inventory.html";
		String actual_URL1 = driver.getCurrentUrl();
		if (expected_URL1.equals(actual_URL1)) {
			System.out.println("URL Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("URL Verified: Test fail");
			System.out.println();
		}

		// Verify if Product is displayed
		WebElement product_card = driver.findElement(By.xpath("//div[@class=\"inventory_list\"]/child::div["+productNum+"]"));
		Boolean result7 = product_card.isDisplayed();
		Boolean result8 = product_card.isEnabled();
		if (result7 && result8) {
			System.out.println("product_card is displayed : " + result7);
			System.out.println();
			System.out.println("product_card is enabled : " + result8);
			System.out.println();
		} else {
			System.out.println("product_card is displayed : " + result7);
			System.out.println();
			System.out.println("product_card is enabled : " + result8);
			System.out.println();
		}

		// Step 3: Click on Product image
		product_card.click();

		// Verify if Product Description page is displayed,
		String expected_URL2 = "https://www.saucedemo.com/inventory-item.html?id=0";
		String actual_URL2 = driver.getCurrentUrl();
		if (expected_URL2.equals(actual_URL2)) {
			System.out.println("URL Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("URL Verified: Test fail");
			System.out.println();
		}

		/*
		// Validate Add to cart button
		WebElement add_to_cart_Button = driver.findElement(
				By.xpath("//div[text()=\"Sauce Labs Bike Light\"]/following-sibling::button[@id=\"add-to-cart\"]"));
		Boolean result9 = add_to_cart_Button.isDisplayed();
		Boolean result10 = add_to_cart_Button.isEnabled();
		if (result9 && result10) {
			System.out.println("add_to_cart_Button is displayed : " + result9);
			System.out.println();
			System.out.println("add_to_cart_Button is enabled : " + result10);
			System.out.println();
		} else {
			System.out.println("add_to_cart_Button is displayed : " + result9);
			System.out.println();
			System.out.println("add_to_cart_Button is enabled : " + result10);
			System.out.println();
		}

		// Step 4: Click on Add to cart button
		add_to_cart_Button.click();

		// Validate Remove button
		WebElement remove_button = driver.findElement(
				By.xpath("//div[text()=\"Sauce Labs Bike Light\"]/following-sibling::button[@id=\"remove\"]"));
		Boolean result11 = remove_button.isDisplayed();
		if (result11) {
			System.out.println("remove_button is displayed : " + result11);
			System.out.println();
		} else {
			System.out.println("remove_button is displayed : " + result11);
			System.out.println();
		}

		// Validate cart icon
		WebElement cart_Icon = driver.findElement(By.cssSelector(".shopping_cart_link"));
		Boolean result12 = cart_Icon.isDisplayed();
		Boolean result13 = cart_Icon.isEnabled();
		if (result12 && result13) {
			System.out.println("cart_Icon is displayed : " + result12);
			System.out.println();
			System.out.println("cart_Icon is enabled : " + result13);
			System.out.println();
		} else {
			System.out.println("cart_Icon is displayed : " + result12);
			System.out.println();
			System.out.println("cart_Icon is enabled : " + result13);
			System.out.println();
		}

		// Step 5: Click on cart icon
		cart_Icon.click();

		// Vreify If Your cart page d displayed
		String expected_URL3 = "https://www.saucedemo.com/cart.html";
		String actual_URL3 = driver.getCurrentUrl();
		if (expected_URL3.equals(actual_URL3)) {
			System.out.println("URL Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("URL Verified: Test fail");
		}

		// Validate Check out button
		WebElement checkout_button = driver.findElement(By.cssSelector("#checkout"));
		Boolean result14 = checkout_button.isDisplayed();
		Boolean result15 = checkout_button.isEnabled();
		if (result14 && result15) {
			System.out.println("checkout button is displayed : " + result14);
			System.out.println();
			System.out.println("checkout_button : " + result15);
			System.out.println();
		} else {
			System.out.println("checkout_button : " + result14);
			System.out.println();
			System.out.println("checkout_button : " + result15);
			System.out.println();
		}

		// Step 6: Click on Check out button
		checkout_button.click();
	*/
	}
}
