package pom_Repo;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Element initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
   //Element Declaration
	@FindBy(name="user_name")
	private WebElement user_textfield;
	@FindBy(name="user_password")
	private WebElement password_textfield;
	@FindBy(id="submitButton")
	private WebElement loginbutton;

	//getter method
	public WebElement getUser_textfield() {
		return user_textfield;
	}
	public WebElement getPassword_textfield() {
		return password_textfield;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	//business libraries/logits
	public void loginToApp(String USERNAME, String PASSWORD) {
		user_textfield.sendKeys(USERNAME);
		password_textfield.sendKeys(PASSWORD);
		loginbutton.click();
	}
	
	
}
