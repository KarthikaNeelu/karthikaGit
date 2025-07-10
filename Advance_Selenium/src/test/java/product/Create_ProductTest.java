package product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.Excle_Utility;
import genericUtilities.File_Utility;
import genericUtilities.Java_Utility;
import genericUtilities.WebDriver_Utility;
import pom_Repo.CreateProductPage;
import pom_Repo.HomePage;
import pom_Repo.LoginPage;
import pom_Repo.ProductLookUpImage;
import pom_Repo.ValidationProductPage;

public class Create_ProductTest extends BaseClass{

	@Test
	public void Create_ProductTest() throws Throwable
	{

		HomePage home = new HomePage(driver);
		home.clickProductLink();
		ProductLookUpImage lookup = new ProductLookUpImage(driver);
		lookup.clickLookUpimg();
		Java_Utility ranNum = new Java_Utility();
		int ran = ranNum.getRandomNum();
		 Excle_Utility ExLib = new Excle_Utility();
		String pName = ExLib.getExcleFileUtility("Products", 0, 0)+ran;
		CreateProductPage productCreate = new CreateProductPage(driver);
		productCreate.createProduct(pName);
		ValidationProductPage product = new ValidationProductPage(driver);
		product.validproduct(driver, pName);
		
}

	}
	


