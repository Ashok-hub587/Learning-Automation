package learningAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningSoftAssert {

	@Test
	public void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		SoftAssert sObj=new SoftAssert();
		sObj.assertEquals(expectedTitle, actualTitle);
		
		//Validate Username text field
		WebElement usernameTextfield=driver.findElement(By.id("user-name"));
		boolean result1=usernameTextfield.isDisplayed();
		sObj.assertEquals(result1, true);
		//sObj.assertEquals(driver.findElement(By.id("user-name")).isDisplayed(), true);
		
		//Validate Password text field
		WebElement passwordTextfield=driver.findElement(By.cssSelector("#password"));
		boolean result2=passwordTextfield.isDisplayed();
		sObj.assertEquals(result2, true);
		
		//VALIDATE LOGIN BUTTON
		WebElement loginButton=driver.findElement(By.cssSelector("#login-button"));
		sObj.assertEquals(loginButton.isDisplayed(), true);
		sObj.assertEquals(loginButton.isEnabled(), true);
		
		//Perform Login Action
		usernameTextfield.sendKeys("standard_user");
		passwordTextfield.sendKeys("secret_sauce");
		loginButton.click();
		
		String expectedTitle1="Swag Labs";
		String actualTitle1=driver.getTitle();
		sObj.assertEquals(expectedTitle1, actualTitle1);
		driver.quit();
		sObj.assertAll();//Must be written at the last of Test Method
	}
}
