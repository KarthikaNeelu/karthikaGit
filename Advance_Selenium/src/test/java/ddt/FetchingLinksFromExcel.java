package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingLinksFromExcel {

	public static void main(String[] args) throws Throwable 
	{

		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\excel.xlsx");
		  Workbook book = WorkbookFactory.create(file);
		  Sheet s = book.getSheet("sheet1");
		  int rownum = s.getLastRowNum();
		  for(int i=0;i<rownum;i++) {
			  Row r = s.getRow(i);
			  Cell c = r.getCell(0);
			  String links = c.getStringCellValue();
			  System.out.println(links);
		  }
	}

}
