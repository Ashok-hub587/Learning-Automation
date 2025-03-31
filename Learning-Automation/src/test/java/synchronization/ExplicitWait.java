package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 5l);
		
		driver.get("https://www.shoppersstack.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
