package learningPOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderProduct {

	WebDriver driver;

	@BeforeClass(enabled = true)
	public void settingBrowser() {

		// Confugure the Webdriver
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--headless");
		
		// 1.Launch the Browser
		driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();

		// Provide implicitly wait
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);

	}

	@BeforeMethod(enabled = true)
	public void login() throws IOException {

		// Load Common Data From Propreties File
		FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");
		Properties propertyObj = new Properties();
		propertyObj.load(fis);

		// 2. Navigate To Login Page
		driver.get(propertyObj.getProperty("url"));

		// Fetch Test specific data from Test Data file
		FileInputStream fis1 = new FileInputStream("./src/test/resources/Swaglabs TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis1);

		// Validate Login page
		Assert.assertEquals(driver.getTitle(),
				book.getSheet("PageValidations").getRow(1).getCell(1).getStringCellValue());

		// Create Instance Of Home_Page.java file
		Home_Page homepageObj = new Home_Page(driver);

		// Validate Elements are displayed and Enabled
		Assert.assertEquals(homepageObj.getusername_textfield().isDisplayed(), true);
		Assert.assertEquals(homepageObj.getusername_textfield().isEnabled(), true);

		Assert.assertEquals(homepageObj.getpassword_textfield().isDisplayed(), true);
		Assert.assertEquals(homepageObj.getpassword_textfield().isEnabled(), true);

		Assert.assertEquals(homepageObj.getlogin_button().isDisplayed(), true);
		Assert.assertEquals(homepageObj.getlogin_button().isEnabled(), true);

		// 3. Fetch & Enter username,password Perfom Login Action
		homepageObj.getusername_textfield().sendKeys(propertyObj.getProperty("username"));
		homepageObj.getpassword_textfield().sendKeys(propertyObj.getProperty("password"));
		homepageObj.getlogin_button().click();

		// Verify Navigated to Home Page
		SoftAssert saObj = new SoftAssert();
		saObj.assertEquals(driver.getTitle(),
				book.getSheet("PageValidations").getRow(2).getCell(1).getStringCellValue());
	}

	//Home_Page homepageObj;
	//SoftAssert saObj;
	
	@Test(enabled = true)
	public void addProductoCart() throws EncryptedDocumentException, IOException {

		Home_Page homepageObj = new Home_Page(driver);

		SoftAssert saObj = new SoftAssert();

		FileInputStream fis = new FileInputStream("./src/test/resources/Swaglabs TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);

		// Verify id product is displayed
		saObj.assertEquals(homepageObj.getproduct().isDisplayed(), true);

		// 4. Click on product
		homepageObj.getproduct().click();

		// Verify if navigated to product description page
		saObj.assertEquals(driver.getTitle(),
				book.getSheet("PageValidations").getRow(3).getCell(1).getStringCellValue());

		// Validate add to cart button
		saObj.assertEquals(homepageObj.getaddtocart().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getaddtocart().isEnabled(), true);

		// 5.Cick on Add to cart button
		homepageObj.getaddtocart().click();

		// verify cart badger is displayed
		saObj.assertEquals(homepageObj.getcartbadger().isDisplayed(), true);

		// 6.Click on carticon
		homepageObj.getcartIcon().click();

		// Verify if navigated to checkout page
		saObj.assertEquals(driver.getTitle(),
				book.getSheet("PageValidations").getRow(4).getCell(1).getStringCellValue());

		// Verify Checkout button is displayed
		saObj.assertEquals(homepageObj.getcheckout_button().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getcartbadger().isDisplayed(), true);

		// 7.click on checkout button
		homepageObj.getcheckout_button().click();

		// Verify if navigated to Your information page
		saObj.assertEquals(driver.getTitle(),
				book.getSheet("PageValidations").getRow(5).getCell(1).getStringCellValue());

		// Verify Elements are displayed & enabled
		saObj.assertEquals(homepageObj.getfirstname_textfield().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getfirstname_textfield().isDisplayed(), true);

		saObj.assertEquals(homepageObj.getlastname_textfield().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getlastname_textfield().isDisplayed(), true);

		saObj.assertEquals(homepageObj.getpostalcode_textfield().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getpostalcode_textfield().isDisplayed(), true);

		saObj.assertEquals(homepageObj.getcontinue_button().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getcontinue_button().isDisplayed(), true);

		// 8.Enter address details and click on continue button
		homepageObj.getfirstname_textfield()
				.sendKeys(book.getSheet("TestData").getRow(1).getCell(1).getStringCellValue());
		homepageObj.getlastname_textfield()
				.sendKeys(book.getSheet("TestData").getRow(2).getCell(1).getStringCellValue());
		
		double data=book.getSheet("TestData").getRow(3).getCell(1).getNumericCellValue();
		String postalcode=String.valueOf(data);
		homepageObj.getpostalcode_textfield().sendKeys(postalcode);
		homepageObj.getcontinue_button().click();

		// Verify if navigated to checkout overview page
		saObj.assertEquals(driver.getTitle(),
				book.getSheet("PageValidations").getRow(6).getCell(1).getStringCellValue());

		// Scroll down the page till finish button is visible
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", homepageObj.getfinish_button());

		// verify if finish button is displayed and enabled
		saObj.assertEquals(homepageObj.getfinish_button().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getfinish_button().isEnabled(), true);

		// 9.Click on elements
		homepageObj.getfinish_button().click();

		// Verify if success message is displayed
		saObj.assertEquals(homepageObj.getsuccess_message().isDisplayed(), true);
		
		//take screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/Successmsg.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);

	}

	@AfterMethod(enabled = true)
	public void logout() throws EncryptedDocumentException, IOException {

		Home_Page homepageObj = new Home_Page(driver);
		SoftAssert saObj = new SoftAssert();

		// Verify If menu button displaye and enabled
		saObj.assertEquals(homepageObj.getmenu_button().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getmenu_button().isEnabled(), true);

		// Click on Menu button
		homepageObj.getmenu_button().click();

		// Verify If logout option displaye and enabled
		saObj.assertEquals(homepageObj.getlogout_option().isDisplayed(), true);
		saObj.assertEquals(homepageObj.getlogout_option().isEnabled(), true);
		// Click on Menu button
		homepageObj.getlogout_option().click();

		// Fetch Test specific data from Test Data file
		FileInputStream fis = new FileInputStream("./src/test/resources/Swaglabs TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);

		// verify navigated to logout option
		saObj.assertEquals(driver.getTitle(),
				book.getSheet("PageValidations").getRow(1).getCell(1).getStringCellValue());
	}

	@AfterClass
	public void closeBrowsre() {

		SoftAssert saObj = new SoftAssert();
		driver.quit();
		saObj.assertAll();
	}
}
