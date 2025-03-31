package handlingMultipleElements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSugession {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the search data");
		String search_data = scan.next();

		//close Scanner Object
		scan.close();
		
		// Configure the web driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate To Url
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);

		// Identify The search bar
		WebElement searchbox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

		searchbox.sendKeys(search_data);
		driver.manage().timeouts().implicitlyWait(40l, TimeUnit.SECONDS);
		List<WebElement> sugesstions = driver.findElements(By.xpath("//div[text()='" + search_data + "']"));
		int count = sugesstions.size();
		System.out.println("The count is: " + count);

		for (int i = 0; i < count; i++) {
			String text = sugesstions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
