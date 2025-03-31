package learningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	@Test
	public void task1() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Create an instance for Login_page
		Login_Page loginObj=new Login_Page(driver);
		
		driver.navigate().refresh();
		
		loginObj.getusername_textfield().sendKeys("standard_user");
		
		loginObj.getpassword_textfield().sendKeys("secret_sauce");
		
		loginObj.getlogin_Button().click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}
}
