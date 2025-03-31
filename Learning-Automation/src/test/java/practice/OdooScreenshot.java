package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OdooScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 30l);

		driver.manage().window().maximize();

		driver.get("https://www.odoo.com/");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Industries']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Billboard Rental']")));

		action.moveToElement(driver.findElement(By.xpath("//a[text()='Billboard Rental']"))).perform();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File temp = ts.getScreenshotAs(OutputType.FILE);

		File permenent = new File("./Screenshot/OddoScreenshot1.jpeg");

		FileHandler.copy(temp, permenent);

		driver.quit();
	}
}
