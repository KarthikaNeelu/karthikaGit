package pom_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationProductDeleted {

	public ValidationProductDeleted(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void validDelete(WebDriver driver,String pName) {
		List<WebElement> prdData = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr//td[3]"));
		 boolean flag=false;
		 for (WebElement prd : prdData) {
			String actPrd = prd.getText();
			if(actPrd.contains(pName))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Product Name is Deleted");
		}
		else
		{
			System.out.println("Product Name is not Deleted");
			
		}
	}
}
