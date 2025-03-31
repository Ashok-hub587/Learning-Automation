package learningAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningHardAssert {
	@Test
	public void verifyTitle() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		/*
		 * if (expectedTitle.equals(actualTitle)) {
		 * System.out.println("Verification successful: Test Pass"); } else {
		 * System.out.println("Verification successful: Test Fail"); }
		 */
		Assert.assertEquals(expectedTitle, actualTitle);

		// Validate Username text field
		WebElement usernameTextfield = driver.findElement(By.id("user-name"));
		Assert.assertEquals(usernameTextfield.isDisplayed(), true);
		Assert.assertEquals(usernameTextfield.isEnabled(), true);

		// Validate Password text field
		WebElement passwordTextfield = driver.findElement(By.cssSelector("#password"));
		Assert.assertEquals(passwordTextfield.isDisplayed(), true);
		Assert.assertEquals(passwordTextfield.isEnabled(), true);

		// VALIDATE LOGIN BUTTON
		WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
		Assert.assertEquals(loginButton.isDisplayed(), true);
		Assert.assertEquals(loginButton.isEnabled(), false);
		
		driver.quit();
	}
}
