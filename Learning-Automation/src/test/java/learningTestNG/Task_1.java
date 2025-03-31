package learningTestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_1 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser setup successful...!");
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20l);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void login() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login successful..!");
	}

	@Test
	public void addFirstProduct() throws IOException {
		System.out.println("1st product is displayed: "
				+ driver.findElement(By.xpath("(//div[@class='inventory_item']/div/a/img)[1]")).isDisplayed());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='inventory_item']/div/a/img)[1]")));
		driver.findElement(By.xpath("(//div[@class='inventory_item']/div/a/img)[1]")).click();
		driver.findElement(By.cssSelector("#add-to-cart")).click();
		System.out.println("First Product Added...!!");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/firstproduct.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, destination);
	}

	@Test
	public void removeFirstProduct() throws IOException {
		driver.findElement(By.xpath("(//div[@class='inventory_item']/div/a/img)[1]")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/firstproduct.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, destination);
		driver.findElement(By.id("remove")).click();
		System.out.println("First Product removed successfully...!!");
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		System.out.println("Logout successful...!");
	}

	@AfterClass
	public void browserTerminate() {
		driver.close();
		System.out.println("Browser Termination successful...!");
	}

}
