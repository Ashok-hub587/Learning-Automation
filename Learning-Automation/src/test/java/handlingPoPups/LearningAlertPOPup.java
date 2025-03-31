package handlingPoPups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningAlertPOPup {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		//Identify Alert Button

		WebElement clickMe = driver.findElement(By.xpath("//label[contains(text(),'prompt box')]/../button"));
		
		clickMe.click();
		
		Thread.sleep(5000);
		
		//Pass the Alert Data
		driver.switchTo().alert().sendKeys("Ashok");
		
		//Click on OK
		driver.switchTo().alert().accept();
	}
}
