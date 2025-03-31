package basicSelenium;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest1 {
	public static void main(String[] args) {
		
		// Configure the Driver Executable file Edge
		WebDriverManager.edgedriver().setup();
		// Step1: Launch the browser Edge
		EdgeDriver driver = new EdgeDriver();
		
		driver.close();
	}
}
