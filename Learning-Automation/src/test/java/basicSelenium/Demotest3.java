package basicSelenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest3 {
	public static void main(String[] args) {
		//Configure the Driver Executable file Firefox
		WebDriverManager.firefoxdriver().setup();
		//Step1: Launch the browser Firefox
		FirefoxDriver driver = new FirefoxDriver();
		driver.close();
	}
}
