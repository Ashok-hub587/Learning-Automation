package learningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	// 1.Elements Declaration
	@FindBy(id = "user-name")
	private WebElement username_tetfield;

	@FindBy(id = "password")
	private WebElement password_textfield;

	@FindBy(id = "login-button")
	private WebElement login_button;

	//2.Element Intialization
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.Element Utilization
	public WebElement getusername_textfield() {
		return username_tetfield;
	}

	public WebElement getpassword_textfield() {
		return password_textfield;
	}

	public WebElement getlogin_Button() {
		return login_button;
	}

}
