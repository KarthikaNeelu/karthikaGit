package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Con_orgLookUpImage {

	public Con_orgLookUpImage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Select']")
	private WebElement orglookup;
	public WebElement getOrglookup() {
		return orglookup;
	}
	
	//business libraries
	public void clickLookUpOrg() {
		orglookup.click();
	}
}
