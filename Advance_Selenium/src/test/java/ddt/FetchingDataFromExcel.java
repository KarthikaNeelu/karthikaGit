package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws Throwable, IOException {
 
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\excel.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet s = book.getSheet("sheet2");
		Row r = s.getRow(1);
		Cell c = r.getCell(3);
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(c);
		System.out.println(data);
		
	}

}
