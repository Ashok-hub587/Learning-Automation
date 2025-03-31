package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AESuccessMessage {
	public static void main(String[] args) throws InterruptedException {
		// Pre step: Configuring the web driver
		WebDriverManager.chromedriver().setup();

		// Step 1: Opening Browser Navigating To Url
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");

		// Step2: Validating the signup_Login Linktext
		WebElement Signup_Login = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
		boolean result1 = Signup_Login.isDisplayed();
		boolean result2 = Signup_Login.isEnabled();
		if (result1 && result2) {
			System.out.println("Signup_Login Button is Displayed " + result1);
			System.out.println();
			System.out.println("Signup_Login Button is Enabled " + result2);
			System.out.println();
		} else {
			System.out.println("Signup_Login Button is Displayed " + result1);
			System.out.println();
			System.out.println("Signup_Login Button is Enabled " + result2);
			System.out.println();
		}

		// Step3: Click on Signup_Login Linktext
		Signup_Login.click();

		// Step4 : Verify if Navigated To Page
		String expected_Text = "Automation Exercise - Signup / Login";
		String actual_text = driver.getTitle();
		if (expected_Text.equals(actual_text)) {
			System.out.println("Title Verified: Test Pass");
			System.out.println();
		} else {
			System.out.println("Title Verified: Test fail");
			System.out.println();
		}

		// Step 5: Validate The Elements in signup-Login Page
		// Name textfield
		WebElement name_textfield = driver.findElement(By.name("name"));
		boolean result3 = name_textfield.isDisplayed();
		boolean result4 = name_textfield.isEnabled();
		if (result3 && result4) {
			System.out.println("Name textfield is Displayed " + result3);
			System.out.println();
			System.out.println("Name textfield is Enabled " + result4);
			System.out.println();
		} else {
			System.out.println("Name textfield is Displayed " + result3);
			System.out.println();
			System.out.println("Name textfield is Enabled " + result4);
			System.out.println();
		}
		
		// Email Address text field
		WebElement email_textfield = driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
		boolean result5 = email_textfield.isDisplayed();
		boolean result6 = email_textfield.isEnabled();
		if (result5 && result6) {
			System.out.println("Email Address textfield is Displayed " + result5);
			System.out.println();
			System.out.println("Email Address textfield is Enabled " + result6);
			System.out.println();
		} else {
			System.out.println("Email Address textfield is Displayed " + result5);
			System.out.println();
			System.out.println("Email Address textfield is Enabled " + result6);
			System.out.println();
		}

		// Signup Button
		WebElement signup_button = driver.findElement(By.xpath("//button[text()='Signup']"));
		boolean result7 = signup_button.isDisplayed();
		boolean result8 = signup_button.isEnabled();
		if (result5 && result6) {
			System.out.println("SignUp button is Displayed " + result7);
			System.out.println();
			System.out.println("SignUp button textfield is Enabled " + result8);
			System.out.println();
		} else {
			System.out.println("SignUp button is Displayed " + result7);
			System.out.println();
			System.out.println("SignUp button is Enabled " + result8);
			System.out.println();
		}

		// Step 6: Enter Name into Name Textfield,Email into Email textfield,click on
		// signup button
		name_textfield.sendKeys("Tinaut");
		email_textfield.sendKeys("beyeuauh57@gmail.com");
		signup_button.click();

		// Step7: Verify if Navigated To Page
		String expected_Text1 = "Automation Exercise - Signup";
		String actual_text1 = driver.getTitle();
		if (expected_Text1.equals(actual_text1)) {
			System.out.println("Title Verified: Test Pass");
			System.out.println();
		} else {
			System.out.println("Title Verified: Test fail");
			System.out.println();
		}

		// Step8: Validate The all Elements in Signup form page
		WebElement mr = driver.findElement(By.id("id_gender1"));// xpath by using id
		boolean result9 = mr.isDisplayed();
		boolean result10 = mr.isEnabled();
		if (result9 && result10) {
			System.out.println("mr radio button is Displayed " + result9);
			System.out.println();
			System.out.println("mr radio button is Enabled " + result10);
			System.out.println();
		} else {
			System.out.println("mr radio button is Displayed " + result9);
			System.out.println();
			System.out.println("mr radio button is Enabled " + result10);
			System.out.println();
		}

		WebElement password_textfield = driver.findElement(By.xpath("//input[contains(@data-qa,\"pass\")]"));
		boolean result11 = password_textfield.isDisplayed();
		boolean result12 = password_textfield.isEnabled();
		if (result11 && result12) {
			System.out.println("password_textfield is Displayed " + result11);
			System.out.println();
			System.out.println("password_textfield is Enabled " + result12);
			System.out.println();
		} else {
			System.out.println("password_textfield is Displayed " + result11);
			System.out.println();
			System.out.println("password_textfield is Enabled " + result12);
			System.out.println();
		}

		WebElement newsletter_checkbox = driver.findElement(By.id("newsletter"));
		boolean result13 = newsletter_checkbox.isDisplayed();
		boolean result14 = newsletter_checkbox.isEnabled();
		if (result13 && result14) {
			System.out.println("newsletter_checkbox is Displayed " + result13);
			System.out.println();
			System.out.println("newsletter_checkbox is Enabled " + result14);
			System.out.println();
		} else {
			System.out.println("newsletter_checkbox is Displayed " + result13);
			System.out.println();
			System.out.println("newsletter_checkbox is Enabled " + result14);
			System.out.println();
		}

		WebElement offers_checkbox = driver.findElement(By.name("optin"));
		boolean result15 = offers_checkbox.isDisplayed();
		boolean result16 = offers_checkbox.isEnabled();
		if (result15 && result16) {
			System.out.println("offers_checkbox is Displayed " + result15);
			System.out.println();
			System.out.println("offers_checkbox is Enabled " + result16);
			System.out.println();
		} else {
			System.out.println("offers_checkbox is Displayed " + result15);
			System.out.println();
			System.out.println("offers_checkbox is Enabled " + result16);
			System.out.println();
		}

		WebElement firstnameTextfield = driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]"));
		boolean result17 = firstnameTextfield.isDisplayed();
		boolean result18 = firstnameTextfield.isEnabled();
		if (result17 && result18) {
			System.out.println("name_textfield is Displayed " + result17);
			System.out.println();
			System.out.println("name_textfield is Enabled " + result18);
			System.out.println();
		} else {
			System.out.println("name_textfield is Displayed " + result17);
			System.out.println();
			System.out.println("name_textfield is Enabled " + result18);
			System.out.println();
		}

		WebElement lastname_textfield = driver.findElement(By.id("last_name"));
		boolean result19 = lastname_textfield.isDisplayed();
		boolean result20 = lastname_textfield.isEnabled();
		if (result19 && result20) {
			System.out.println("lastname_textfield is Displayed " + result19);
			System.out.println();
			System.out.println("lastname_textfield is Enabled " + result20);
			System.out.println();
		} else {
			System.out.println("lastname_textfield is Displayed " + result19);
			System.out.println();
			System.out.println("lastname_textfield is Enabled " + result20);
			System.out.println();
		}

		WebElement address_textfield = driver.findElement(By.name("address1"));
		boolean result21 = address_textfield.isDisplayed();
		boolean result22 = address_textfield.isEnabled();
		if (result21 && result22) {
			System.out.println("address_textfield is Displayed " + result21);
			System.out.println();
			System.out.println("address_textfield is Enabled " + result22);
			System.out.println();
		} else {
			System.out.println("address_textfield is Displayed " + result21);
			System.out.println();
			System.out.println("address_textfield is Enabled " + result22);
			System.out.println();
		}

		WebElement state_textfield = driver.findElement(By.xpath("//input[@data-qa=\"state\"]"));
		boolean result23 = state_textfield.isDisplayed();
		boolean result24 = state_textfield.isEnabled();
		if (result23 && result24) {
			System.out.println("state_textfield is Displayed " + result23);
			System.out.println();
			System.out.println("state_textfield is Enabled " + result24);
			System.out.println();
		} else {
			System.out.println("state_textfield is Displayed " + result23);
			System.out.println();
			System.out.println("state_textfield is Enabled " + result24);
			System.out.println();
		}

		WebElement city_textfield = driver.findElement(By.cssSelector("input[name=\"city\"]"));
		boolean result25 = city_textfield.isDisplayed();
		boolean result26 = city_textfield.isEnabled();
		if (result25 && result26) {
			System.out.println("city_textfield is Displayed " + result25);
			System.out.println();
			System.out.println("city_textfield is Enabled " + result26);
			System.out.println();
		} else {
			System.out.println("city_textfield is Displayed " + result25);
			System.out.println();
			System.out.println("city_textfield is Enabled " + result26);
			System.out.println();
		}

		WebElement zipcode_textfield = driver.findElement(By.cssSelector("#zipcode"));// Locator Using cssSelector id
		boolean result27 = zipcode_textfield.isDisplayed();
		boolean result28 = zipcode_textfield.isEnabled();
		if (result27 && result28) {
			System.out.println("zipcode_textfield is Displayed " + result27);
			System.out.println();
			System.out.println("zipcode_textfield is Enabled " + result28);
			System.out.println();
		} else {
			System.out.println("zipcode_textfield is Displayed " + result27);
			System.out.println();
			System.out.println("zipcode_textfield is Enabled " + result28);
			System.out.println();
		}

		WebElement mobilenumber_textfield = driver.findElement(By.id("mobile_number"));
		boolean result29 = mobilenumber_textfield.isDisplayed();
		boolean result30 = mobilenumber_textfield.isEnabled();
		if (result29 && result30) {
			System.out.println("mobilenumber_textfield is Displayed " + result29);
			System.out.println();
			System.out.println("mobilenumber_textfield is Enabled " + result30);
			System.out.println();
		} else {
			System.out.println("mobilenumber_textfield is Displayed " + result29);
			System.out.println();
			System.out.println("mobilenumber_textfield is Enabled " + result30);
			System.out.println();
		}

		WebElement createaccount_button = driver.findElement(By.xpath("//button[contains(text(),'Account')]"));
		boolean result31 = createaccount_button.isDisplayed();
		boolean result32 = createaccount_button.isEnabled();
		if (result31 && result32) {
			System.out.println("createaccount_button is Displayed " + result31);
			System.out.println();
			System.out.println("createaccount_button is Enabled " + result32);
			System.out.println();
		} else {
			System.out.println("createaccount_button is Displayed " + result31);
			System.out.println();
			System.out.println("createaccount_button is Enabled " + result32);
			System.out.println();
		}

		// Step5: Fill all signup form details

		mr.click();
		boolean result33 = mr.isSelected();
		if (result33) {
			System.out.println("mr radio_button is selected : " + result33);
			System.out.println();
		} else {
			System.out.println("mr radio_button is selected : " + result33);
			System.out.println();
		}

		password_textfield.sendKeys("tktgyg@y7");

		newsletter_checkbox.click();
		boolean result34 = newsletter_checkbox.isSelected();
		if (result34) {
			System.out.println("newsletter_checkbox is selected : " + result34);
			System.out.println();
		} else {
			System.out.println("newsletter_checkbox is selected : " + result34);
			System.out.println();
		}

		offers_checkbox.click();
		boolean result35 = offers_checkbox.isSelected();
		if (result35) {
			System.out.println("offers_checkbox is selected : " + result35);
			System.out.println();
		} else {
			System.out.println("offers_checkbox is selected : " + result35);
			System.out.println();
		}

		firstnameTextfield.sendKeys("naya");
		lastname_textfield.sendKeys("jawan");
		address_textfield.sendKeys("mumbai");
		state_textfield.sendKeys("MH");
		city_textfield.sendKeys("mumbai");
		zipcode_textfield.sendKeys("526635");
		mobilenumber_textfield.sendKeys("8632563658");
		Thread.sleep(5000);
		createaccount_button.submit();
		
		//Step9: Verify if navigated to Page
		String expected_Title="Automation Exercise - Account Created";
		String actual_Title=driver.getTitle();
		if (expected_Title.equals(actual_Title)) {
			System.out.println("Page Verified: Test Pass");
			System.out.println();
		} else {
			System.out.println("Page Verified: Test fail");
			System.out.println();
		}
		
		//Get properties of Result Message Text
		WebElement result_Message = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! Your new')]"));
		String result_Text=result_Message.getText();
		System.out.println("Account Status is: "+result_Text);
		System.out.println();
		
		String result_Tag=result_Message.getTagName();
		System.out.println("Result text tag is: "+result_Tag);
		System.out.println();
		
		System.out.println("Result text style attribute value is: "+result_Message.getAttribute("style"));
		System.out.println();
		System.out.println("Result text css font-family value is: "+result_Message.getCssValue("font-family"));
		System.out.println();
		
		org.openqa.selenium.Dimension text_size=result_Message.getSize();
		System.out.println("Account status text size is: "+text_size);
		System.out.println("Account status text width is: "+text_size.width);
		System.out.println("Account status text height is: "+text_size.height);
		System.out.println();
		
		org.openqa.selenium.Point text_position=result_Message.getLocation();
		System.out.println("Account status text location is: "+ text_position);
		System.out.println("Account status text x-coordinate is: "+text_position.x);
		System.out.println("Account status text y-coordinate is: "+text_position.getY());
		Thread.sleep(5000);
		driver.close();

	}
}
