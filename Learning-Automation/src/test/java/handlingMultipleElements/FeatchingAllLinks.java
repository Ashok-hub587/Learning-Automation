package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FeatchingAllLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//Fetch all the Links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		//Count Of elements
		int	count=allLinks.size();
		System.out.println("The count is: "+count);
		
		//Printing the element text
		for (int i = 0; i < count; i++) {
			String text=allLinks.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
