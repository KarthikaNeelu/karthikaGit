package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLookUpImage {

	public ProductLookUpImage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="[alt='Create Product...']")
	private WebElement lookUpimg;
	public WebElement getLookUpimg() {
		return lookUpimg;
	}
	
	//business libraries
	public void clickLookUpimg() {
		lookUpimg.click();
	}
	
}
