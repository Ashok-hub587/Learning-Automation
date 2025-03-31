package learningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	//1.Elements Declaration 
	@FindBy(id="user-name")
	private WebElement username_tetfield;
	
	@FindBy(id="password")
	private WebElement password_textfield;
	
	@FindBy(id="login-button")
	private WebElement login_button;
	
	@FindBy(xpath = "(//div[@class=\"inventory_item\"])[1]/div/a/img")
	private WebElement product;
	
	@FindBy(id="add-to-cart")
	private WebElement addtocart;
	
	@FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//span[text()='1']")
	private WebElement cart_badge;
	
	@FindBy(id="checkout")
	private WebElement checkout_button;
	
	@FindBy(name="firstName")
	private WebElement firstname_textfield;
	
	@FindBy(id="last-name")
	private WebElement lastname_textfield;
	
	@FindBy(name="postalCode")
	private WebElement postalcode_textfield;
	
	@FindBy(id="continue")
	private WebElement continue_button;
	
	@FindBy(xpath = "//button[text()='Finish']")
	private WebElement finish_button;
	
	@FindBy(xpath = "//div[contains(text(),'Your order has been dispatched')]")
	private WebElement success_message;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement menu_button;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logout_option;
	
	//2.Element Initialization
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.Element Utilization
	public WebElement getusername_textfield() {
		return username_tetfield;
	}
	
	public WebElement getpassword_textfield() {
		return password_textfield;
	}
	
	public WebElement getlogin_button() {
		return login_button;
	}
	
	public WebElement getproduct() {
		return product;
	}
	
	public WebElement getaddtocart() {
		return addtocart;
	}
	
	public WebElement getcartIcon() {
		return cartIcon;
	}
	
	public WebElement getcartbadger() {
		return cart_badge;
	}
	
	public WebElement getcheckout_button() {
		return checkout_button;
	}
	
	public WebElement getfirstname_textfield() {
		return firstname_textfield;
	}
	
	public WebElement getlastname_textfield() {
		return lastname_textfield;
	}
	
	public WebElement getpostalcode_textfield() {
		return postalcode_textfield;
	}
	
	public WebElement getcontinue_button() {
		return continue_button;
	}
	
	public WebElement getfinish_button() {
		return finish_button;
	}
	
	public WebElement getsuccess_message() {
		return success_message;
	}
	
	public WebElement getmenu_button() {
		return menu_button;
	}
	
	public WebElement getlogout_option() {
		return logout_option;
	}
}
