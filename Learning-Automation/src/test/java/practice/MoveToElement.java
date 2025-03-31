package practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Browser Name");
		String browserName=scan.next();
		
		scan.close();
		
		WebDriver driver=null;
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else {
			System.out.println("Enter valid browser name");
		} 

		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("https://www.odoo.com/");

		Actions actionobj = new Actions(driver);
		
		actionobj.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Industries']")).click();
		
		//Thread.sleep(3000);
		
		actionobj.moveToElement(driver.findElement(By.xpath("//a[text()='Bar and Pub']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Bar and Pub']")).click();
		
		System.out.println(driver.getTitle());

		driver.quit();
	}
}
