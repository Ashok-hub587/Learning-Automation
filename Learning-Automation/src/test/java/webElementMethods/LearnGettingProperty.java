package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGettingProperty {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement logo_Txt = driver.findElement(By.xpath("//div[text()=\"Swag Labs\"]"));
		String text = logo_Txt.getText();
		System.out.println("Elemenent Text is: " + text);
		System.out.println("Element Tag is: " + logo_Txt.getTagName());
		System.out.println("Element Class Attribute is: " + logo_Txt.getAttribute("class"));
		System.out.println("Element Cssproperty value is " + logo_Txt.getCssValue("font-size"));
		org.openqa.selenium.Dimension size = logo_Txt.getSize();
		System.out.println("Element size is :" + size);
		System.out.println("Elemenet size is :" + size.width);
		System.out.println("Element size is :" + size.height);
		org.openqa.selenium.Point position = logo_Txt.getLocation();
		System.out.println("Elemet location is: " + position);
		
		Thread.sleep(5000);
		driver.quit();

	}
}
