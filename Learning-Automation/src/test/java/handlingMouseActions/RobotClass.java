package handlingMouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		WebElement usrname_Textfield = driver.findElement(By.id("user-name"));

		usrname_Textfield.sendKeys("standard_user", Keys.TAB, "secret_sauce", Keys.TAB, Keys.ENTER);

		Thread.sleep(3000);

		driver.get("https://www.google.co.in/");

		Robot robotObj = new Robot();

		robotObj.keyPress(KeyEvent.VK_CAPS_LOCK);
		robotObj.keyRelease(KeyEvent.VK_CAPS_LOCK);

		robotObj.keyPress(KeyEvent.VK_A);
		robotObj.keyRelease(KeyEvent.VK_A);

		robotObj.keyPress(KeyEvent.VK_S);
		robotObj.keyRelease(KeyEvent.VK_S);
		
		robotObj.keyPress(KeyEvent.VK_H);
		robotObj.keyRelease(KeyEvent.VK_H);
		
		robotObj.keyPress(KeyEvent.VK_O);
		robotObj.keyRelease(KeyEvent.VK_O);
		
		robotObj.keyPress(KeyEvent.VK_K);
		robotObj.keyRelease(KeyEvent.VK_K);
		
		Thread.sleep(3000);

		driver.quit();

	}
}
