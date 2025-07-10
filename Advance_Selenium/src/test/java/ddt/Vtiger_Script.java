package ddt;

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
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vtiger_Script {

	public static void main(String[] args) throws Throwable 
	{

		FileInputStream file = new FileInputStream("../Advance_Selenium/data.properties");
		Properties p = new Properties();
		p.load(file);
		String str1 = p.getProperty("url");
		String str2 = p.getProperty("username");
		String str3 = p.getProperty("password");
		WebDriver driver=new FirefoxDriver();
		driver.get(str1);
		driver.findElement(By.name("user_name")).sendKeys(str2);
		driver.findElement(By.name("user_password")).sendKeys(str3);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Products")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[alt='Create Product...']")).click();
		FileInputStream f=new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\excel.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet s = book.getSheet("sheet3");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String pName = c.getStringCellValue();
		System.out.println(pName);
		driver.findElement(By.name("productname")).sendKeys(pName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		 String actData = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		 if(actData.equals(pName)) {
			 System.out.println("product is created");
		 }
		 else {
			 System.out.println("product is not created");
		 }
	}

}
