package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "campaignname")
	private WebElement campaignName;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	public WebElement getCampaignName() {
		return campaignName;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	//business libraries
	public void enterCamName(String name) {
		campaignName.sendKeys(name);
	}
	public void clickOnSaveButton() {
		saveButton.click();
	}
}
