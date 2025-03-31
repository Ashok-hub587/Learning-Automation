package handlingMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragElement {
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
		driver.get("https://www.tutorialspoint.com/selenium/practice/dragabble.php");
		
		Thread.sleep(3000);
		
		//Switch to Axis Restriced Tab
		driver.findElement(By.id("nav-profile-tab")).click();
		
		Thread.sleep(2000);

		// Identify the Element
		WebElement xAxis = driver.findElement(By.id("div_element"));

		WebElement yAxis = driver.findElement(By.id("div_elementy"));

		// Create Actions class object
		Actions actionobj = new Actions(driver);
		
		//Drag X Axis Element 
		actionobj.dragAndDropBy(xAxis, 200, 0).perform();
		
		Thread.sleep(3000);
		
		//Drag Y Axis Element
		actionobj.dragAndDropBy(yAxis, 0, 200).perform();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.close();

	}
}
