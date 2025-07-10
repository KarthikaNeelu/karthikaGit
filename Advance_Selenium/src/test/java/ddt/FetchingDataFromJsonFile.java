package ddt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchingDataFromJsonFile {

	public static void main(String[] args) throws Throwable
	{

		File f = new File("../Advance_Selenium/data.json");
		ObjectMapper obj = new ObjectMapper();
		JsonNode data = obj.readTree(f);
		 String browser = data.get("browser").asText();
		 String url = data.get("url").asText();	
		 String email = data.get("email").asText();
		 String password = data.get("password").asText();
   WebDriver driver;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(password);
	
	}
	

}
