package takesScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		WebElement search = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));

		search.sendKeys("Ashok");

		Thread.sleep(3000);
		
		//----------------Steps to take ScreenShot------------//
		
		//1.Perform type casting From WD to TS
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//2.Take Screenshot and store in temp path
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		//3.Create Permanent Path
		File permenent = new File("./Screenshot/MyFirstScreenshot1.png");
		
		//4.Copy temp path to perenent path
		org.openqa.selenium.io.FileHandler.copy(temp, permenent);//File handler class from selenium
		
		driver.quit();
	}
}
