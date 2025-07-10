package pom_Repo;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatOrganizationPage {

	public CreatOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="accountname")
	private WebElement orgname;
	@FindBy(id="phone")
	private WebElement orgphone;
	@FindBy(id="email1")
	private WebElement orgemail;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	public WebElement getOrganName() {
		return orgname;
	}
	public WebElement getPhoneNum() {
		return orgphone;
	}
	public WebElement getEmailId() {
		return orgemail;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public void createOrganization(String name,String phone,String email) {
		
		orgname.sendKeys(name);
		orgphone.sendKeys(phone);
		orgemail.sendKeys(email);
		saveButton.click();
	}
	public void enterorgname(String name) {
		orgname.sendKeys(name);
	}
}
