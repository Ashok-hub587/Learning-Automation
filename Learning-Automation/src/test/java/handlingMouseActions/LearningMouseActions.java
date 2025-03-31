package handlingMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningMouseActions {
	public static void main(String[] args) throws InterruptedException {
		
		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Provide implicitely wait
		driver.manage().timeouts().implicitlyWait(201, TimeUnit.SECONDS);

		// Navigate to Application
		driver.get("https://www.ebay.com/");

		// Identify the Element
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Electronics']"));

		// Create Actions class object
		Actions actionobj = new Actions(driver);

		// Move to element
		actionobj.moveToElement(element1).perform();

		// Click on Element
		actionobj.click(driver.findElement(By.xpath("//a[text()='Electronics']"))).perform();
		
		Thread.sleep(3000);

		// Double Click on Element
		actionobj.doubleClick(driver.findElement(By.xpath("//a[text()='Electronics']"))).perform();

		// Right Click on Element
		actionobj.contextClick(driver.findElement(By.xpath("//a[text()='Electronics']"))).perform();
	}
}
