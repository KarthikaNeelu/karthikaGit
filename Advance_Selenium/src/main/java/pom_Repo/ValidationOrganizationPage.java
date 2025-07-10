package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationOrganizationPage {

	public ValidationOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//business libraries
	public void validOrganization(WebDriver driver,String expdata) {
		String actdata = driver.findElement(By.id("dtlview_Organization Name")).getText();
		//if (actdata.equals(expdata)) {
			//System.out.println("organization name is created");
		//}
		//else {
			//System.out.println("organization name is not created");
		//}
		Assert.assertEquals(actdata, expdata,"organization name is not created");
		System.out.println("organization name is created");
	}
}
