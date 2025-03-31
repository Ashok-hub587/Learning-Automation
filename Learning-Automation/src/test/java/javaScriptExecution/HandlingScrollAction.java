package javaScriptExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollAction {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30l,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://qwipo.com/");
		
		Thread.sleep(2000);
			
		//1.Identify the element
		WebElement element=driver.findElement(By.xpath("//h3[text()=' Address']"));
		
		//2.Perform Type casting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String jscode2="window.scrollBy(0,500)";
		js.executeScript(jscode2);
		Thread.sleep(2000);
		
		String jscode1="window.scrollTo(0,1000)";
		js.executeScript(jscode1);
		Thread.sleep(2000);
		
		//3.Scroll to element
		String jscode3="arguments[0].scrollIntoView(false)";
		js.executeScript(jscode3, element);
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
