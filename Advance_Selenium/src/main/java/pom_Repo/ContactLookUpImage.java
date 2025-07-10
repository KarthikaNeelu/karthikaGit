package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactLookUpImage {

	public ContactLookUpImage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Contact...']")
			private WebElement lookUpimg;
	public WebElement getLookUpimg() {
		return lookUpimg;
	}
	//business libraries
	public void clickContactLookUpImg() {
		lookUpimg.click();
	}
}
