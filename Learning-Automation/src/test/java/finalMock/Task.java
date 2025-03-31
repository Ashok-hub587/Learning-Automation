package finalMock;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {

	WebDriver driver;

	@BeforeClass
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void login() throws IOException {
		driver.get("https://www.saucedemo.com/");
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(expectedTitle, driver.getTitle());
		Assert.assertEquals(driver.findElement(By.id("user-name")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.id("user-name")).isEnabled(), true);

		Assert.assertEquals(driver.findElement(By.name("password")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.name("password")).isEnabled(), true);

		Assert.assertEquals(driver.findElement((By.className("submit-button btn_action"))).isDisplayed(), true);
		Assert.assertEquals(driver.findElement((By.className("submit-button btn_action"))).isEnabled(), true);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/Loginpage.img");
		FileHandler.copy(temp, destination);

		driver.findElement(By.className("submit-button btn_action")).click();

		String expectedTitle1 = "Swag Labs";
		Assert.assertEquals(expectedTitle1, driver.getTitle());
	}

	@Test
	public void task1() throws IOException {

		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

		Select sObj = new Select(filter);
		sObj.selectByIndex(2);

		WebElement firstproduct = driver.findElement(By.xpath("(//div[@class=\"inventory_item\"])[1]/child::div[1]"));// Xpath by child
																														// axis xpath

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/productpage.img");
		FileHandler.copy(temp, destination);

		firstproduct.click();
		String expectedTitle1 = "Swag Labs";
		Assert.assertEquals(expectedTitle1, driver.getTitle());

		WebElement productDescription = driver
				.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']/parent::div"));// Xpath by parent axis
																								// path
		String productDescription1 = productDescription.getText();
		System.out.println("Product desccription is: " + productDescription1);

		WebElement addToCart = driver.findElement(By.xpath("Add to cart"));// Xpath by text
		addToCart.click();

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File temp1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("./Screenshot/productdescription.img");
		FileHandler.copy(temp1, destination1);

	}

}
