package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws Throwable {
//WebDriver driver=new ChromeDriver();file
        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CommonData.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		String BROWSER = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");

		WebDriver driver;
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		driver.findElement(By.name("login")).click();
		}


	}


