package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampLookUpImage {
//elements initialization
	public CampLookUpImage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//Element declaration
	@FindBy(css = "[title='Create Campaign...']")
	private WebElement lookUpImg;
	
	//getter method
	public WebElement getLookUpImg() {
		return lookUpImg;
	}


	//business libraries
	public void clickLookUpImg() {
		lookUpImg.click();
	}
}
