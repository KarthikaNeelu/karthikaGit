package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable
	{
      FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\excel.xlsx");
	  Workbook book = WorkbookFactory.create(file);
	  Sheet s = book.getSheet("sheet1");
	  WebDriver driver =new FirefoxDriver();
      driver.get("https://www.flipkart.com/");
      List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	  for(int i=0;i<allLinks.size();i++) 
	  {
	  
		Row r = s.createRow(i);
		Cell c = r.createCell(0);
	     c.setCellValue(allLinks.get(i).getAttribute("href"));
	
	
	}
	 FileOutputStream out = new FileOutputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\excel.xlsx");
	 book.write(out);

}}
