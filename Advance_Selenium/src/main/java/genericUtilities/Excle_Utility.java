package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excle_Utility {

	public String getExcleFileUtility(String sheetname,int rowNum,int cellNum) throws Throwable {
		FileInputStream f=new FileInputStream("../Advance_Selenium/excel1.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet s = book.getSheet(sheetname);
		Row r = s.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		String ExcleData = c.getStringCellValue();
		System.out.println(ExcleData);
		return ExcleData;
	}
	public String getExcleDataUsingDataFormatter(String sheetname,int rowNum,int cellNum) throws Throwable {
		
		FileInputStream f=new FileInputStream("../Advance_Selenium/excel1.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet s = book.getSheet(sheetname);
		Row r1 = s.getRow(rowNum);
		Cell c1 = r1.getCell(cellNum);
		DataFormatter format = new DataFormatter();
		String excledata = format.formatCellValue(c1);
		System.out.println(excledata);
		return excledata;
	    
		
	}
	
	public Object[][] getData(String SheetName) throws Throwable{
		FileInputStream f=new FileInputStream("../Advance_Selenium/excel1.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet s = book.getSheet(SheetName);
		int lastrow = s.getLastRowNum()+1;
		 int lastcell = s.getRow(0).getLastCellNum();
		return null;
	}
}
