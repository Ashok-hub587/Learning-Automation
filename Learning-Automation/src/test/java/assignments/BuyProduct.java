package assignments;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//This program is written To Verify User Can Buy A Product
public class BuyProduct {
	public static void main(String[] args) throws InterruptedException {

		// Taking Brower input from User
		Scanner scan = new Scanner(System.in);
		System.out.println("Ener the browser name");
		String browserName = scan.next();
		
		//Declare product Variable
		System.out.println("Enter Product Name");
		String product=scan.next();
		
		//Close Scanner Class object
		scan.close();
		
		//Declare driver variable
		WebDriver driver=null;

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
		WebElement product_card = driver.findElement(By.xpath("//img[contains(@alt,'"+product+"')]"));
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

		// Verify Checkout: Your Information page is displayed
		String expected_URL4 = "https://www.saucedemo.com/checkout-step-one.html";
		String actual_URL4 = driver.getCurrentUrl();
		if (expected_URL4.equals(actual_URL4)) {
			System.out.println("Title Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("Title Verified: Test fail");
			System.out.println();
		}

		// Verify if web elements are displayed and enabled
		WebElement firstname_Textfield = driver.findElement(By.id("first-name"));
		WebElement lastname_Textfield = driver.findElement(By.id("last-name"));
		WebElement postalcode_Textfield = driver.findElement(By.id("postal-code"));
		WebElement continue_button = driver.findElement(By.id("continue"));

		// Validate firstname_Textfield
		Boolean result16 = firstname_Textfield.isDisplayed();
		Boolean result17 = firstname_Textfield.isEnabled();
		if (result16 && result17) {
			System.out.println("firstname_Textfield is displayed : " + result16);
			System.out.println();
			System.out.println("firstname_Textfield is enabled : " + result17);
			System.out.println();
		} else {
			System.out.println("firstname_Textfield is displayed : " + result16);
			System.out.println();
			System.out.println("firstname_Textfield is enabled : " + result17);
			System.out.println();
		}

		// Verify lastname_Textfield
		Boolean result18 = lastname_Textfield.isDisplayed();
		Boolean result19 = lastname_Textfield.isEnabled();
		if (result18 && result19) {
			System.out.println("lastname_Textfield is displayed : " + result18);
			System.out.println();
			System.out.println("lastname_Textfield is enabled : " + result19);
			System.out.println();
		} else {
			System.out.println("lastname_Textfield is displayed : " + result18);
			System.out.println();
			System.out.println("lastname_Textfield is enabled : " + result19);
			System.out.println();
		}

		// Verify postal-code textfield
		Boolean result20 = postalcode_Textfield.isDisplayed();
		Boolean result21 = postalcode_Textfield.isEnabled();
		if (result20 && result21) {
			System.out.println("postal-code textfield is displayed : " + result20);
			System.out.println();
			System.out.println("postal-code textfield is enabled : " + result21);
			System.out.println();
		} else {
			System.out.println("postal-code textfield is displayed : " + result20);
			System.out.println();
			System.out.println("postal-code textfield is enabled : " + result21);
			System.out.println();
		}

		// Verify continue button 
		Boolean result22 = continue_button.isDisplayed();
		Boolean result23 = continue_button.isEnabled();
		if (result22 && result23) {
			System.out.println("continue_button is displayed : " + result22);
			System.out.println();
			System.out.println("continue_button is enabled : " + result23);
			System.out.println();
		} else {
			System.out.println("continue_button is displayed : " + result22);
			System.out.println();
			System.out.println("continue_button is enabled : " + result23);
			System.out.println();
		}

		// Step 7: Enter data click on continue
		firstname_Textfield.sendKeys("Ponagu");
		lastname_Textfield.sendKeys("Vivek");
		postalcode_Textfield.sendKeys("693125");
		continue_button.click();

		// Verify checkout Over view page is displayed
		String expected_URL5 = "https://www.saucedemo.com/checkout-step-two.html";
		String actual_URL5 = driver.getCurrentUrl();
		if (expected_URL5.equals(actual_URL5)) {
			System.out.println("URL Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("URL Verified: Test fail");
			System.out.println();
		}

		// Verify and Validate Finish button
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
		WebElement finish_button = driver.findElement(By.cssSelector("#finish"));
		Boolean result24 = finish_button.isDisplayed();
		Boolean result25 = finish_button.isEnabled();
		if (result24 && result25) {
			System.out.println("finish_button is displayed : " + result24);
			System.out.println();
			System.out.println("finish_button is enabled : " + result25);
			System.out.println();
		} else {
			System.out.println("finish_button is displayed : " + result24);
			System.out.println();
			System.out.println("finish_button is enabled : " + result25);
			System.out.println();
		}

		// Step 8: Click on Finish button
		finish_button.click();

		// Verify Checkout: Complete! page and success message is displayed
		String expected_URL6 = "https://www.saucedemo.com/checkout-complete.html";
		String actual_URL6 = driver.getCurrentUrl();
		if (expected_URL6.equals(actual_URL6)) {
			System.out.println("URL Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("URL Verified: Test fail");
			System.out.println();
		}

		// Validate Message
		String expected_message = "Thank you for your order!";
		WebElement message_Text = driver.findElement(By.xpath("//h2[text()=\"Thank you for your order!\"]"));
		String actual_message = message_Text.getText();
		if (expected_message.equals(actual_message)) {
			System.out.println("message Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("message Verified: Test fail");
			System.out.println();
		}

		// Verify & Validate menu icon
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#react-burger-menu-btn")));
		WebElement menu_icon = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
		Boolean result26 = menu_icon.isDisplayed();
		Boolean result27 = menu_icon.isEnabled();
		if (result26 && result27) {
			System.out.println("menu_icon is displayed : " + result26);
			System.out.println();
			System.out.println("menu_icon is enabled : " + result27);
			System.out.println();
		} else {
			System.out.println("menu_icon is displayed : " + result26);
			System.out.println();
			System.out.println("menu_icon is enabled : " + result27);
			System.out.println();
		}

		// Step 9: Click on Menu
		menu_icon.click();

		// Verify Validate Logout option
		WebElement logout_Link = driver.findElement(By.cssSelector("#logout_sidebar_link"));
		Boolean result28 = logout_Link.isDisplayed();
		Boolean result29 = logout_Link.isEnabled();
		if (result28 && result29) {
			System.out.println("menu_icon is displayed : " + result28);
			System.out.println();
			System.out.println("menu_icon is enabled : " + result29);
			System.out.println();
		} else {
			System.out.println("menu_icon is displayed : " + result28);
			System.out.println();
			System.out.println("menu_icon is enabled : " + result29);
			System.out.println();
		}

		// Step 10: Click on Logout
		logout_Link.click();

		// Verify if Swags Labs Login page is displayed
		String expected_URL7 = "https://www.saucedemo.com/";
		String actual_URL7 = driver.getCurrentUrl();
		if (expected_URL7.equals(actual_URL7)) {
			System.out.println("Title Verified: Test pass");
			System.out.println();
		} else {
			System.out.println("Title Verified: Test fail");
			System.out.println();
		}
		
		// Step 11: Close the browser
		driver.quit();
	}
}
