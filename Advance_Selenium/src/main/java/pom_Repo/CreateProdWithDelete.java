package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProdWithDelete {

	
	public CreateProdWithDelete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deletebutton;
	
	
	public WebElement getDelete() {
		return deletebutton;
	}
	
	//business libraries
	public void clickPrdCheckbox(WebDriver driver,String name) {
		driver.findElement(By.xpath("//table[@class='lvt small']//a[text()='" +name+ "']/../preceding-sibling::td[2]//input[@type=\"checkbox\"]")).click();
	}
	public void DeleteProduct() {
		
		deletebutton.click();
	}
}
