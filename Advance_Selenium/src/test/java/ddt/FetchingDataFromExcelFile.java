package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelFile {

	public static void main(String[] args) throws Throwable, IOException {

		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\excel.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet s = book.getSheet("sheet2");
		Row r = s.getRow(3);
		Cell c = r.getCell(1);
		String data = c.getStringCellValue();
		System.out.println(data);
	}

}
