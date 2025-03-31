package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningWebTable {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		// List<WebElement> firstname =
		// driver.findElements(By.xpath("//td[@scope='row']/../td[@scope='row']"));

		// Print all departments in table
		List<WebElement> firstname = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));

		for (int i = 0; i < firstname.size(); i++) {
			System.out.println(firstname.get(i).getText());
		}

		List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]"));

		for (int i = 0; i < thirdRow.size(); i++) {
			
			System.out.println(thirdRow.get(i).getText());
		}
	}
}
