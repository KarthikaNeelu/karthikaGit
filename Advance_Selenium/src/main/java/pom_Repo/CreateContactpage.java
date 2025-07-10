package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriver_Utility;

public class CreateContactpage {

	public CreateContactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	private WebElement firstname1;
	@FindBy(name="lastname")
	private WebElement lastname1;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	//getter methods
	public WebElement getFirstname() {
		return firstname1;
	}
	public WebElement getLastname() {
		return lastname1;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public void selectDropDown(WebDriver driver) {
		WebElement dropDwon= driver.findElement(By.xpath("//select[@name=\"salutationtype\"]"));
		WebDriver_Utility weblib = new WebDriver_Utility();
		weblib.clickdropDown(dropDwon, "Mr.");
	}
	public void contactPage(String firstname,String lastname) {
		firstname1.sendKeys(firstname);
		lastname1.sendKeys(lastname);
		}
	public void saveContact() {
		saveButton.click();
	}
}
