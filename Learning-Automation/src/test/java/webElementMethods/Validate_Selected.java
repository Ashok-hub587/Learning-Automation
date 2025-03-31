package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_Selected {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String expected_title = "Demo Web Shop";
		String actual_title = driver.getTitle();
		if (expected_title.equals(actual_title)) {
			System.out.println("Test Verified:Test Pass");
		} else {
			System.out.println("Test Verified:Test Fail");
		}
		WebElement good_radioButton = driver.findElement(By.xpath("//input[@id=\"pollanswers-2\"]"));
		boolean result1 = good_radioButton.isDisplayed();
		if (result1) {
			System.out.println("Good radio Button is Displayed: " + result1);
		} else {
			System.out.println("Good radio Button is not Displayed :" + result1);
		}
		good_radioButton.click();
		boolean result2 = good_radioButton.isSelected();
		if (result2) {
			System.out.println("Good Radio Button is selected: " + result2);
		} else {
			System.out.println("Good Radio Button is not selected: " + result2);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
