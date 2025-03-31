package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnManage {
	public static void main(String[] args) throws InterruptedException {
		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Customize Browser---Maximize
		// driver.manage().window().maximize();

		// Fetch The Browser size
		Dimension size=driver.manage().window().getSize();
		System.out.println("Browser size--(Width,Height): "+ size);
		
		//Fetch The Browser Position
		Point position=driver.manage().window().getPosition();
		System.out.println("Browser position--(X,Y): "+ position);
		
		// Step2:Navigate to the Application Via URL
		driver.get("https://www.saucedemo.com/");
		
		//Customize Browser---FullScreen
		driver.manage().window().fullscreen();
		
		//Customize Browser Position
		driver.manage().window().setPosition(new Point(50,200));
		
		Thread.sleep(5000);
		
		//Customize Browser size
		driver.manage().window().setSize(new Dimension(1000,1000));
		
		//Wait statment
		Thread.sleep(5000);
		
		//Close the Browser
		driver.quit();
		
	}
}
