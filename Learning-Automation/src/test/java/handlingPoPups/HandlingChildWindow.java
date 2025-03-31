package handlingPoPups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingChildWindow {
	public static void main(String[] args) {
		// Configure the browser
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// step2: Navigate to the Application
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		// Fetch The Parent window address
		String parent_window = driver.getWindowHandle();
		// Print the parent window address
		System.out.println("Parent window Address is: " + parent_window);
		System.out.println("--------------------");
		
		// click the button to appear Child_Window popup
		driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
		// Fetch all window address
		Set<String> allwindows = driver.getWindowHandles();
		
		// Print all window addreses
		for (String windowaddreses : allwindows) {
			System.out.println(windowaddreses);
		}
		
		//Fetch title of Child Window
		for (String child : allwindows) {
			 
			if (!parent_window.equals(child)) {
				//Switch the driver control
				driver.switchTo().window(child);
				//Fetch the child window title
				String title=driver.getTitle();
				System.out.println("Child window title is: "+title);
				//Close Child window
				driver.close();
			}
		}
	}
}
