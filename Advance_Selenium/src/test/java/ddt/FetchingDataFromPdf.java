package ddt;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchingDataFromPdf {

	public static void main(String[] args) throws Throwable 
	{

		File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\data.pdf");
		PDDocument doc = PDDocument.load(f);
		int pages = doc.getNumberOfPages();
		System.out.println(pages);
		new PDFTextStripper();
	}

}
