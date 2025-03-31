package handlingDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningDropDown {
	public static void main(String[] args) {
		// Configure the web driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Wait statements
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver, 20l);
		
		// Navigate To Url
		driver.get("https://www.amazon.in/");
		//Verify the page
		System.out.println(driver.getTitle());
		
		//===========Step to Automate dropdown================//
		
		//Identify the dropdown
		//wait.until(ExpectedConditions.elementToBeSelected(By.id("searchDropdownBox")));//timeoutexception
		WebElement all_dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		//identify the element is displayed and Enabled
		System.out.println("Displayed drowpdown status "+all_dropdown.isDisplayed());
		System.err.println("Enabled dropdown status "+all_dropdown.isEnabled());
		
		//Create an object For select class
		Select selectobj=new Select(all_dropdown);
		
		//VERIFY THE DROPDOWN SINGLE OR MULTIPLE SELECT TYPE
		boolean result=selectobj.isMultiple();
		if (result) {
			System.out.println("all_dropdown is multiple select type dropdown");
		} else {
			System.out.println("all_dropdown is single select type dropdown");
		}
		//Select the option -Using index
		selectobj.selectByIndex(1);
		
		//Select the option using visable text
		selectobj.selectByVisibleText("Amazon Fashion");
		
		//Select the option using value
		selectobj.selectByValue("search-alias=amazon-pharmacy");
		
		//Fetch all the options
		List<WebElement> all_options=selectobj.getOptions();
		
		//Print the options
		for (int i = 0; i <all_options.size() ; i++) {
		String	text=all_options.get(i).getText();
		System.out.println(text);
		}
		
		//close the Browser
		driver.close();
		
	}
}
