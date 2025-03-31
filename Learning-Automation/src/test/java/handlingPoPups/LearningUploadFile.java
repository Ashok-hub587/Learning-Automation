package handlingPoPups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningUploadFile {

	public static void main(String[] args) throws InterruptedException {

		// pre-step1: Configure the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Launch the Browser---Chrome
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Navigate to Application
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		
		Thread.sleep(5000);
		
		//-----------------Handling File upload popup
		
		//1.Create an Object for file class
		File fileobj=new File("./data/Notes.txt");
		
		//2.Fetch the Absolute path
		String absolutepath=fileobj.getAbsolutePath();
		
		//3.Pass the path inside the Element
		driver.findElement(By.id("uploadFile")).sendKeys(absolutepath);
	}
}
