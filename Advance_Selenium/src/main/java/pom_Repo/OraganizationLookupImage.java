package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OraganizationLookupImage {

	public OraganizationLookupImage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement lookUpImg;
	
	public WebElement getLookUpImg() {
		return lookUpImg;
	}

	//business libraries
	public void clickLookUpimg() {
		lookUpImg.click();
	}
}
