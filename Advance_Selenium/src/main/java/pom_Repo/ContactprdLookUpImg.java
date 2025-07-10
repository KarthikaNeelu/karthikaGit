package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactprdLookUpImg {

	public ContactprdLookUpImg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectPrd;
	
	public WebElement getSelectPrd() {
		return selectPrd;
	}
	
	//business libraries
	public void selectprdcontact() {
		selectPrd.click();
	}
}
