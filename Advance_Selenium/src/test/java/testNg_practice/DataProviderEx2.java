package testNg_practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtilities.Excle_Utility;
import pom_Repo.CreateContactpage;

public class DataProviderEx2 {

	@Test(dataProvider="getData")
	public void createContact(String FirstName,String LastName) throws Throwable {
		//WebDriver driver=new ChromeDriver();
		//driver.get("http://localhost:8888/");
		 FileInputStream fis = new FileInputStream("../Advance_Selenium/data.properties");
			Properties pro = new Properties();
			pro.load(fis);
			String BROWSER = pro.getProperty("browser");
			String URL = pro.getProperty("url");
			String USERNAME = pro.getProperty("username");
			String PASSWORD = pro.getProperty("password");

			WebDriver driver;
			if (BROWSER.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}

			else if (BROWSER.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}

			else if (BROWSER.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				driver = new EdgeDriver();
			}
		driver.get(URL);	
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
	}
	@DataProvider
	public Object[][] getData(WebDriver driver) throws Throwable{
		Object[][] obj=new Object[3][2];
		//obj[0][0]="raji";
		//obj[0][1]="kumari";
		//obj[1][0]="jaya";
		//obj[1][1]="kumar";
		//obj[2][0]="neela";
		//obj[2][1]="sunder";
		Excle_Utility exlib = new Excle_Utility();
		String FirstName = exlib.getExcleFileUtility("Data", 0, 0);
		String Lastname = exlib.getExcleFileUtility("Data", 0, 1);
		FirstName=exlib.getExcleFileUtility("Data", 1, 0);
		Lastname=exlib.getExcleFileUtility("Data", 1, 1);
		FirstName=exlib.getExcleFileUtility("Data", 2, 0);
		Lastname=exlib.getExcleFileUtility("Data", 2, 1);
		
		
		return obj;
		
	}
}
