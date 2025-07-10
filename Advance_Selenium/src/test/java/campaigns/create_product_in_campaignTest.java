package campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
import pom_Repo.ValidationProductInCampaign;
import pom_Repo.WindowSwitching;

//Login to vtiger application->mouseOverOn more Link->click on campaigns->click on create campaign lookup image->Enter campaignName->Click on Product plus img->Handle the PopUp->Product name should be added to campaign createpage->
//click on save Btn->verify whether the campaign name is created in campaign Information page and Logout from the application.

public class create_product_in_campaignTest extends BaseClass {

	@Test(groups="smokeTest")
	public void create_product_in_campaignTest() throws Throwable {
	
		HomePage home=new HomePage(driver);
		home.clickProductLink();
		ProductLookUpImage prodlookup = new ProductLookUpImage(driver);
		prodlookup.clickLookUpimg();
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNum();
		Excle_Utility exlib = new Excle_Utility();
		String pName = exlib.getExcleFileUtility("Products", 2, 0)+ran;
		CreateProductPage createprod = new CreateProductPage(driver);
		createprod.createProduct(pName);
		//-------------------------------------------------------------------
		home.clickCampaignLink();
		CampLookUpImage camplook = new CampLookUpImage(driver);
		camplook.clickLookUpImg();
		String pCampaign = exlib.getExcleFileUtility("Campaign", 1, 0);
		CreateCampaignPage createcamp = new CreateCampaignPage(driver);
		createcamp.enterCamName(pCampaign);
		WindowSwitching windowswitch = new WindowSwitching(driver);
		windowswitch.clickPrdLookUpImgInCamp();
		WebDriver_Utility wLib = new WebDriver_Utility();
		wLib.windowSwitching(driver, "Products&action");
		windowswitch.enterPrdDetails(pName);
		windowswitch.enterPrdNameInCamp(driver, pName);
        wLib.windowSwitching(driver, "Campaigns&action");
		createcamp.clickOnSaveButton();
		ValidationProductInCampaign valid = new ValidationProductInCampaign(driver);
		valid.validProduct(driver, pCampaign);
			
			
	}

}
