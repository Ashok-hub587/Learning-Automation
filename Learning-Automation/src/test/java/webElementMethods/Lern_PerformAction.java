package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lern_PerformAction {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement login_button=driver.findElement(By.xpath("//a[@href=\"/login\"]"));
		login_button.click();
		WebElement email_textfield = driver.findElement(By.id("Email\"]"));
		WebElement passwoed_textfield = driver.findElement(By.id("Password"));
		WebElement rememberme_checkbox = driver.findElement(By.id("RememberMe"));
		WebElement login_button1 = driver.findElement(By.className("button-1 login-button"));
		
		email_textfield.sendKeys("ekalfn@gmai.com");
		email_textfield.clear();
		passwoed_textfield.sendKeys("eidnuh$#");
		rememberme_checkbox.click();
		login_button1.submit();
		// Perform Action

		
	}
}
