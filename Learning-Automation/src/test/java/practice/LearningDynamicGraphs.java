package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningDynamicGraphs {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://emicalculator.net/");

		String barsXpath = "//*[name()='g' and @class=\"highcharts-series-group\"]//*[name()='rect' and @class=\"highcharts-point\"]";
		String details = "//*[name()='svg']//*[name()='g' and @class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"]//*[name()='text']";

		List<WebElement> bars = driver.findElements(By.xpath(barsXpath));

		System.out.println("Total no of bars are: " + bars.size());
		System.out.println();

		Actions actObj = new Actions(driver);

		for (WebElement e : bars) {

			actObj.moveToElement(e).perform();
			//Thread.sleep(500);

			WebElement emiDetails = driver.findElement(By.xpath(details));
			System.out.println("The EMI details are: " + emiDetails.getText());
			System.out.println();
		}

		driver.quit();
	}
}
