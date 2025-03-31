package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learn_manage1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		Dimension size = driver.manage().window().getSize();
		System.out.println("Browser size is: (Width,Height):--" + size);
		Point position = driver.manage().window().getPosition();
		System.out.println("Browser position is--" + position);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().setPosition(new Point(100, 100));
		Thread.sleep(5000);
		driver.manage().window().setSize(new Dimension(900, 700));
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.close();
	}
}
