package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pom_Repo.HomePage;
import pom_Repo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void BS() {
	System.out.println("Database connection");	
	}
	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void BT() {
		System.out.println("parallel excution");
	}
	
//	@Parameters("BROWSER")
//	public void BC(String BROWSER)
	@BeforeClass(groups = {"smokeTest","regressionTest"})
   public void BC() throws Throwable 
	
	{
		File_Utility fiLib = new File_Utility();
		String BROWSER = fiLib.getKeyandValue("browser");
	//	String BROWSER = System.getProperty("browser");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		System.out.println("Launching browser");
		sdriver=driver;
	}
	//@Parameters({"URL","USERNAME","PASSWORD"})
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void BM() throws Throwable {
		File_Utility fiLib = new File_Utility();
		String BROWSER = fiLib.getKeyandValue("browser");
	//	String BROWSER = System.getProperty("browser");
		String URL = fiLib.getKeyandValue("url");
	//	String URL = System.getProperty("url");
		String USERNAME = fiLib.getKeyandValue("username");
	//	String USERNAME = System.getProperty("username");
		String PASSWORD = fiLib.getKeyandValue("password");
	//	String PASSWORD = System.getProperty("password");
		driver.get(URL);
		LoginPage login=new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
		WebDriver_Utility wLib = new WebDriver_Utility();
		wLib.maximizeWindow(driver);
		wLib.waitElemntToLoad(driver);

		System.out.println("Login to app");
	}
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void AM() {
		HomePage home = new HomePage(driver);
		home.logoutApp();
		System.out.println("Logout from app");
	}
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void AC() {
		driver.quit();
		System.out.println("close the browser");
	}
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void AT() {
		System.out.println("parallel execution");
	}
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void AS() {
		System.out.println("close database connection");
	}
}
