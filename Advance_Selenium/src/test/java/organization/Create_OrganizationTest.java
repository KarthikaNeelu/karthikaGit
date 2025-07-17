package organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
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
import pom_Repo.CreatOrganizationPage;
import pom_Repo.CreateProductPage;
import pom_Repo.HomePage;
import pom_Repo.LoginPage;
import pom_Repo.OraganizationLookupImage;
import pom_Repo.ProductLookUpImage;
import pom_Repo.ValidationOrganizationPage;
import pom_Repo.ValidationProductPage;

public class Create_OrganizationTest extends BaseClass{

	@Test
	public void Create_OrganizationTest() throws Throwable 
	{

		HomePage home = new HomePage(driver);
		home.clickOrgLink();
		OraganizationLookupImage organization = new OraganizationLookupImage(driver);
		organization.clickLookUpimg();
		Java_Utility ranNum = new Java_Utility();
		int ran = ranNum.getRandomNum();
		Excle_Utility ExLib = new Excle_Utility();
	    String org_name = ExLib.getExcleFileUtility("Organization", 0, 4)+ran;
		String org_phone = ExLib.getExcleDataUsingDataFormatter("Organization", 1, 4)+ran;
		String org_email = ExLib.getExcleDataUsingDataFormatter("Organization", 2, 4)+ran;
		CreatOrganizationPage organ = new CreatOrganizationPage(driver);
		organ.createOrganization(org_name, org_phone, org_email);
		ValidationOrganizationPage valid = new ValidationOrganizationPage(driver);
		valid.validOrganization(driver, org_name);
		

	}
	//==================================================================================================

	
}
