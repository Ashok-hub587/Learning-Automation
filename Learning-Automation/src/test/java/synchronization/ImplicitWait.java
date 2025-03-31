package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		//Pre step: Configure the web driver
		WebDriverManager.chromedriver().setup();
		//Step 1: Open browser and Maximaize The browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Provise implicitly wait
		driver.manage().timeouts().implicitlyWait(40l, TimeUnit.SECONDS);
		//Navigate to URL
		driver.get("https://www.shoppersstack.com/");
		//Step2: Click On element
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
