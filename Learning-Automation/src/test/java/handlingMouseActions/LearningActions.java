package handlingMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningActions {
	public static void main(String[] args) throws InterruptedException {
		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Navigate to Application
		driver.get("https://qspiders.com/");
		
		//Provide implicitely wait
		driver.manage().timeouts().implicitlyWait(201, TimeUnit.SECONDS);

		// Identify the Element
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Offline Centers']"));

		// Create Actions class object
		Actions actionobj = new Actions(driver);
		
		//Mouse hover to Element1
		actionobj.moveToElement(element1).perform();
		
		Thread.sleep(3000);
		
		//Identify element Hyderabad ==> Mouse hover
		actionobj.moveToElement(driver.findElement(By.xpath("//button[text()='Hyderabad']"))).perform();
		
		Thread.sleep(3000);
		
		//Identify element Software testing java selenium
		actionobj.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Course with Java Selenium')]"))).perform();
		
		Thread.sleep(3000);

		//Identify Kphb qspiders ==> mouse hover
		actionobj.moveToElement(driver.findElement(By.xpath("//a[contains(@href,\"/branches/kphb-qspiders\")]"))).perform();
		
		Thread.sleep(3000);
		
		//Click on Element
		driver.findElement(By.xpath("//a[contains(@href,\"/branches/kphb-qspiders\")]")).click();
		
		Thread.sleep(5000);
		
		//Close the browser
		driver.close();
	}
}
