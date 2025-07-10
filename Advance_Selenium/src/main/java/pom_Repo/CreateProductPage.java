package pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {

	public CreateProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="productname")
	private WebElement pName;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	public WebElement getpName() {
		return pName;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//business libraries
	public void createProduct(String name) {
		pName.sendKeys(name);
		saveButton.click();
	}
}
