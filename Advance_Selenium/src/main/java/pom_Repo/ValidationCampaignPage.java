package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationCampaignPage {

	public ValidationCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//business libraries
	public void validationCampaign(WebDriver driver,String expdata) {
String actdata = driver.findElement(By.id("dtlview_Campaign Name")).getText();
		
		if (actdata.equals(expdata)) {
			System.out.println("campaign name is created");
		}
		else {
			System.out.println("campaign name is not created");
		}
//Assert.assertEquals(actdata, expdata,"campaign name is not created");
//System.out.println("campaign name is created");
	}
}
