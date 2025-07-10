package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationProductPage {

	public ValidationProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//business libraries
	public void validproduct(WebDriver driver,String expdata) {
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		// if(actData.equals(expdata)) {
			// System.out.println("product is created");
		 //}
		 //else {
			// System.out.println("product is not created");
	//	 }
		Assert.assertEquals(actData, expdata,"product is not created");
		System.out.println("product is created");
	}
}
