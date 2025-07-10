package product;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.Excle_Utility;
import genericUtilities.File_Utility;
import genericUtilities.Java_Utility;
import genericUtilities.WebDriver_Utility;
import pom_Repo.CreateProdWithDelete;
import pom_Repo.CreateProductPage;
import pom_Repo.HomePage;
import pom_Repo.LoginPage;
import pom_Repo.ProductLookUpImage;
import pom_Repo.ValidationProductDeleted;
import pom_Repo.ValidationProductPage;

public class CreateProductAndDeleteTest extends BaseClass {

	@Test
	public void CreateProductAndDeleteTest() throws Throwable
	{
		
		HomePage home = new HomePage(driver);
		home.clickProductLink();
		ProductLookUpImage lookup = new ProductLookUpImage(driver);
		lookup.clickLookUpimg();
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNum();
		Excle_Utility exlib = new Excle_Utility();
		String pName = exlib.getExcleFileUtility("Products", 2, 0)+ran;
		CreateProductPage createProduct = new CreateProductPage(driver);
		createProduct.createProduct(pName);
		ValidationProductPage valid = new ValidationProductPage(driver);
		valid.validproduct(driver, pName);
		home.clickProductLink();
		CreateProdWithDelete deleprd = new CreateProdWithDelete(driver);
		deleprd.clickPrdCheckbox(driver, pName);
		deleprd.DeleteProduct();
		WebDriver_Utility weblib = new WebDriver_Utility();
		 weblib.alertHandle(driver);
		ValidationProductDeleted proDelete = new ValidationProductDeleted(driver);
		proDelete.validDelete(driver, pName);
	
	}

}
