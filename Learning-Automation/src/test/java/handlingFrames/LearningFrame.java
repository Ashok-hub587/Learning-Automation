package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningFrame {
	public static void main(String[] args) {

		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Navigate to Application
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");

		// Swith to driver control ==> M.page to Frame
		driver.switchTo().frame(1);

		// Identify Message inside page and print it
		WebElement text = driver.findElement(By.xpath("//h1[text()='New Tab']"));
		System.out.println(text.getText());
		
		//Switch to main page
		driver.switchTo().defaultContent();
		WebElement text1 = driver.findElement(By.xpath("//h2[text()='Iframe 1']"));
		System.out.println(text1.getText());
		
		//Close The browser
		driver.quit();

	}
}
