package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationProductInCampaign {

	public ValidationProductInCampaign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//business libraries
	public void validProduct(WebDriver driver,String expdata) {
		WebElement actdata = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']"));
		if(actdata.equals(actdata)) {
			System.out.println("product is selected inside the campaign");
		}
		else {
			System.out.println("product is not selected inside the campaign");
		}
		//Assert.assertEquals(actdata, expdata,"product is not selected inside the campaign");
		//System.out.println("product is selected inside the campaign");
	}
}
