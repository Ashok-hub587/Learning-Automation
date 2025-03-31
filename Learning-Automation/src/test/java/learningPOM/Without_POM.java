package learningPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Without_POM {

	@Test
	public void task1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username_textfiled=driver.findElement(By.id("user-name"));
		WebElement password_textfiled=driver.findElement(By.id("password"));
		WebElement login_Button=driver.findElement(By.id("login-button"));
		
		driver.navigate().refresh();
		
		username_textfiled.sendKeys("standard_user");
		password_textfiled.sendKeys("secret_sauce");
		login_Button.click();
		
	}
}
