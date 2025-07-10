package Contacts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.Excle_Utility;
import genericUtilities.File_Utility;
import genericUtilities.WebDriver_Utility;
import pom_Repo.ContactLookUpImage;
import pom_Repo.CreateContactpage;
import pom_Repo.HomePage;
import pom_Repo.LoginPage;
import pom_Repo.ValidationContactPage;

//@Listeners(genericUtilities.ListenerImp.class)
public class Create_ContactTest extends BaseClass {

	@Test(groups="regressionTest")
	public void Create_ContactTest() throws Throwable {

		HomePage home = new HomePage(driver);
		home.clickContactLink();
		ContactLookUpImage contact = new ContactLookUpImage(driver);
		contact.clickContactLookUpImg();
		//Assert.fail("i am failing this script");
		CreateContactpage dropdown = new CreateContactpage(driver);
		dropdown.selectDropDown(driver);
		Excle_Utility ExLib = new Excle_Utility();
		String firstname = ExLib.getExcleFileUtility("Contacts", 1, 0);
		String lastname = ExLib.getExcleFileUtility("Contacts", 1, 1);
		CreateContactpage contactname = new CreateContactpage(driver);
		contactname.contactPage(firstname, lastname);
		contactname.saveContact();
		ValidationContactPage validContact = new ValidationContactPage(driver);
		validContact.validationContact(driver, firstname);
		//home.logoutApp();
		
		}
//==================================================================
	
}
