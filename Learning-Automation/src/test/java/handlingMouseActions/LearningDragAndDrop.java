package handlingMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningDragAndDrop {
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
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		// Identify the Element
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		// Create Actions class object
		Actions actionobj = new Actions(driver);
		
		Thread.sleep(3000);

		// Perform drag and drop
		actionobj.dragAndDrop(src, target).perform();
		
		//OR
		
		// Drag and drop using Click and hold
		//actionobj.clickAndHold(src).release(target).perform();
		
		//OR
		
		//Drag and Drop Element based on Coordinate
		//actionobj.dragAndDropBy(src, target.getLocation().getX(), target.getLocation().getY()).perform();
		
		//OR
		actionobj.dragAndDropBy(src, 150, 40).perform();
		
		Thread.sleep(3000);
		
		//Close The Browser
		driver.close();

	}
}
