package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Element initialization
     public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
     //Element declaration
	@FindBy(linkText="More")
	private WebElement morelink;
	@FindBy(name="Campaigns")
	private WebElement campaignlink;
	@FindBy(linkText="Contacts")
	private WebElement contactlink;
	@FindBy(linkText="Organizations")
	private WebElement orglink;
	@FindBy(linkText="Products")
	private WebElement productlink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdmLink;
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	//getter method
	public WebElement getMorelink() {
		return morelink;
	}
	
	public WebElement getCampaignlink() {
		return campaignlink;
	}
	public WebElement getContactlink() {
		return contactlink;
	}
	public WebElement getOrglink() {
		return orglink;
	}
	public WebElement getProductlink() {
		return productlink;
   		
	}
	
	public WebElement getAdmLink() {
		return AdmLink;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	//business libraries
	public void clickCampaignLink() {
		morelink.click();
		campaignlink.click();
	}
	public void clickContactLink() {
		contactlink.click();
	}
	public void clickOrgLink() {
		orglink.click();
	}
	public void clickProductLink() {
		productlink.click();
		
	}
	public void logoutApp()
	{
		AdmLink.click();
		signOutLink.click();
	}
}
