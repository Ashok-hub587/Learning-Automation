package handlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAutoSuggestions {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate To Url
		driver.get("https://www.google.co.in/");
		//Identify The search bar
		WebElement searchbox = driver.findElement(By.cssSelector("#APjFqb"));
		
		searchbox.sendKeys("java");
		driver.manage().timeouts().implicitlyWait(40l, TimeUnit.SECONDS);
		//List<WebElement> sugesstion=driver.findElements(By.xpath("//b"));
		List<WebElement> sugesstions=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=sugesstions.size();
		System.out.println("The count is: "+count);
		
		for (int i = 0; i < count; i++) {
			String text=sugesstions.get(i).getText();
			System.out.println(text);
		}
		driver.close();	
	}
}
