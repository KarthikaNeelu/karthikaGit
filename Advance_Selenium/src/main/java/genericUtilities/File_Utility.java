package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class File_Utility {

	public String getKeyandValue(String key) throws Throwable {
		FileInputStream file = new FileInputStream("../Advance_Selenium/data.properties");
		Properties pro = new Properties();
		pro.load(file);
		String velue = pro.getProperty(key);
		return velue;
		
	
	}
}
