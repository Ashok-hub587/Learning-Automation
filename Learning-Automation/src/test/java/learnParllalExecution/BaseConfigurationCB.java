package learnParllalExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConfigurationCB {
	
	WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void browserSetup(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		} else {
			Reporter.log("OOPS .......INVALID BROWSERNAE", true);
		}
		
		Reporter.log("Browser setup success.....!!!");
	}
	
	@AfterClass
	public void browserTerminate() {
		Reporter.log("Browser termination success", true);
		driver.quit();
	}
	
}
