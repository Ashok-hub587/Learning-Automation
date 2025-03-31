package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoWebStore_Signup {
	public static void main(String[] args) throws InterruptedException {
		// Pre step: Configuring the web driver
		WebDriverManager.chromedriver().setup();

		// Step 1: Opening Browser Navigating To Url
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// Step2 : Verify if Navigated To Page
		String expected_Title = "Demo Web Shop";
		String actual_Title = driver.getTitle();
		if (expected_Title.equals(actual_Title)) {
			System.out.println("Title Verified: Test Pass");
			System.out.println();
		} else {
			System.out.println("Title Verified: Test fail");
			System.out.println();
		}

		// Step3 : Validating the Rgistartion Linktext
		WebElement register_Linkext = driver.findElement(By.className("ico-register"));
		boolean result1 = register_Linkext.isDisplayed();
		boolean result2 = register_Linkext.isEnabled();
		if (result1 && result2) {
			System.out.println("register_Linkext is Displayed " + result1);
			System.out.println();
			System.out.println("register_Linkext is Enabled " + result2);
			System.out.println();
		} else {
			System.out.println("register_Linkext is Displayed " + result1);
			System.out.println();
			System.out.println("register_Linkext is Enabled " + result2);
			System.out.println();
		}

		// Step4 : Click on Signup_Login Linktext
		register_Linkext.click();

		// Step5 : Verify if Navigated To Page
		String expected_Title1 = "Demo Web Shop-Registration";
		String actual_Title1 = driver.getTitle();
		System.out.println(actual_Title1);
		if (expected_Title1.equals(actual_Title1)) {
			System.out.println("Title Verified: Test Pass");
			System.out.println();
		} else {
			System.out.println("Title Verified: Test fail");
			System.out.println();
		}

		// Step 5: Validate The Elements in Registration page
		// Gender Radio button
		WebElement gender_radiobutton= driver.findElement(By.id("gender-male"));
		boolean result3 = gender_radiobutton.isDisplayed();
		boolean result4 = gender_radiobutton.isEnabled();
		if (result3 && result4) {
			System.out.println("gender_radiobutton is Displayed " + result3);
			System.out.println();
			System.out.println("gender_radiobutton is Enabled " + result4);
			System.out.println();
		} else {
			System.out.println("gender_radiobutton is Displayed " + result3);
			System.out.println();
			System.out.println("gender_radiobutton is Enabled " + result4);
			System.out.println();
		}

		WebElement firstnameTextfield = driver.findElement(By.name("FirstName"));
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

		WebElement lastname_textfield = driver.findElement(By.id("LastName"));
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

		WebElement email_textfield = driver.findElement(By.id("Email"));
		boolean result21 = email_textfield.isDisplayed();
		boolean result22 = email_textfield.isEnabled();
		if (result21 && result22) {
			System.out.println("email_textfield is Displayed " + result21);
			System.out.println();
			System.out.println("email_textfield is Enabled " + result22);
			System.out.println();
		} else {
			System.out.println("email_textfield is Displayed " + result21);
			System.out.println();
			System.out.println("email_textfield is Enabled " + result22);
			System.out.println();
		}

		WebElement password_textfield = driver.findElement(By.name("Password"));
		boolean result23 = password_textfield.isDisplayed();
		boolean result24 = password_textfield.isEnabled();
		if (result23 && result24) {
			System.out.println("password_textfield is Displayed " + result23);
			System.out.println();
			System.out.println("password_textfield is Enabled " + result24);
			System.out.println();
		} else {
			System.out.println("password_textfield is Displayed " + result23);
			System.out.println();
			System.out.println("password_textfield is Enabled " + result24);
			System.out.println();
		}

		WebElement ConfirmPassword_textfield = driver.findElement(By.cssSelector("#ConfirmPassword"));
		boolean result25 = ConfirmPassword_textfield.isDisplayed();
		boolean result26 = ConfirmPassword_textfield.isEnabled();
		if (result25 && result26) {
			System.out.println("ConfirmPassword_textfield is Displayed " + result25);
			System.out.println();
			System.out.println("ConfirmPassword_textfield is Enabled " + result26);
			System.out.println();
		} else {
			System.out.println("ConfirmPassword_textfield is Displayed " + result25);
			System.out.println();
			System.out.println("ConfirmPassword_textfield is Enabled " + result26);
			System.out.println();
		}

		
		WebElement register_button = driver.findElement(By.xpath("//input[@value=\"Register\"]"));
		boolean result31 = register_button.isDisplayed();
		boolean result32 = register_button.isEnabled();
		if (result31 && result32) {
			System.out.println("register_button is Displayed " + result31);
			System.out.println();
			System.out.println("register_button is Enabled " + result32);
			System.out.println();
		} else {
			System.out.println("register_button is Displayed " + result31);
			System.out.println();
			System.out.println("register_button is Enabled " + result32);
			System.out.println();
		}

		// Step5: Fill all signup form details

		gender_radiobutton.click();
		boolean result33 = gender_radiobutton.isSelected();
		if (result33) {
			System.out.println("gender radio_button is selected : " + result33);
			System.out.println();
		} else {
			System.out.println("gender radio_button is selected : " + result33);
			System.out.println();
		}

		firstnameTextfield.sendKeys("naya");
		lastname_textfield.sendKeys("jawan");
		email_textfield.sendKeys("ebjkjek298@gmail.com");
		password_textfield.sendKeys("tktgyg@y7");
		ConfirmPassword_textfield.sendKeys("tktgyg@y7");
		Thread.sleep(5000);
		register_button.submit();

		// Step9: Verify if navigated to Page
		String expected_Title2 = "Demo Web Shop. Register";
		String actual_Title2 = driver.getTitle();
		System.out.println(actual_Title2);
		if (expected_Title2.equals(actual_Title2)) {
			System.out.println("Page Verified: Test Pass");
			System.out.println();
		} else {
			System.out.println("Page Verified: Test fail");
			System.out.println();
		}

		// Get properties of Result Message Text
		WebElement result_Message = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
		String result_Text = result_Message.getText();
		System.out.println("Account Status is: " + result_Text);
		System.out.println();

		String result_Tag = result_Message.getTagName();
		System.out.println("Result text tag is: " + result_Tag);
		System.out.println();

		System.out.println("Result text style attribute value is: " + result_Message.getAttribute("class"));
		System.out.println();
		System.out.println("Result text css font-family value is: " + result_Message.getCssValue("font-family"));
		System.out.println();

		org.openqa.selenium.Dimension text_size = result_Message.getSize();
		System.out.println("Account status text size is: " + text_size);
		System.out.println("Account status text width is: " + text_size.width);
		System.out.println("Account status text height is: " + text_size.height);
		System.out.println();

		org.openqa.selenium.Point text_position = result_Message.getLocation();
		System.out.println("Account status text location is: " + text_position);
		System.out.println("Account status text x-coordinate is: " + text_position.x);
		System.out.println("Account status text y-coordinate is: " + text_position.getY());
		Thread.sleep(5000);

	}
}
