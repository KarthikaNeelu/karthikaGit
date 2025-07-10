package campaigns;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.Excle_Utility;
import genericUtilities.File_Utility;
import genericUtilities.Java_Utility;
import genericUtilities.WebDriver_Utility;
import pom_Repo.CampLookUpImage;
import pom_Repo.CreateCampaignPage;
import pom_Repo.CreateProductPage;
import pom_Repo.HomePage;
import pom_Repo.LoginPage;
import pom_Repo.ProductLookUpImage;
import pom_Repo.ValidationCampaignPage;
import pom_Repo.ValidationProductPage;

//@Listeners(genericUtilities.ListenerImp.class)
@Listeners(genericUtilities.ExtentReportImp.class)
public class Create_CampaignTest extends BaseClass {

//	@Test(groups="smokeTest")
	//@Test(retryAnalyzer=genericUtilities.RetryAnalyserImp.class)
	@Test
	public void Create_CampaignTest() throws Throwable {
	
		HomePage home = new HomePage(driver);
		home.clickCampaignLink();
		//Assert.fail();
		CampLookUpImage lookup = new CampLookUpImage(driver);
		lookup.clickLookUpImg();
		Excle_Utility ExLib = new Excle_Utility();
		String pCampaign = ExLib.getExcleFileUtility("Campaign", 2, 0);
		CreateCampaignPage campaign = new CreateCampaignPage(driver);
		campaign.enterCamName(pCampaign);
		campaign.clickOnSaveButton();
//Assert.fail("i am failing this script");
		ValidationCampaignPage validCampaign = new ValidationCampaignPage(driver);
		validCampaign.validationCampaign(driver, pCampaign);
		//home.logoutApp();
		
		
	}

}
