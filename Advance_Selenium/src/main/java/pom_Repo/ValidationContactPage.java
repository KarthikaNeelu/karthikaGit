package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationContactPage {

	public ValidationContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//business libraries
	public void validationContact(WebDriver driver,String Expdata) {
		String actdata = driver.findElement(By.xpath("//span[@id='dtlview_First Name']")).getText();
		//if(actdata.equals(Expdata)) {
		//	System.out.println("Contact name is created");
		//}
		//else {
			//System.out.println("Contact name is not created");
		//}
		Assert.assertEquals(actdata, Expdata,"Contact name is not created");
		System.out.println("Contact name is created");
	}
	
}
