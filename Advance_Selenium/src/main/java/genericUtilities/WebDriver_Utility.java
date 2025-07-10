package genericUtilities;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void waitElemntToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void windowSwitching(WebDriver driver,String PartialTitle) {
		Set<String> allWin = driver.getWindowHandles();
		Iterator<String> ite = allWin.iterator();
		while(ite.hasNext()) {
		String wind = ite.next();	
		driver.switchTo().window(wind);
		String title = driver.getTitle();
		if(title.contains("Products&action")) {
			break;
		}
		}
		
		Set<String> allWins1 = driver.getWindowHandles();
		Iterator<String> it1 = allWins1.iterator();

		while (it1.hasNext())
		{
			String win1 = it1.next();
			driver.switchTo().window(win1);
			String title1 = driver.getTitle();
			if (title1.contains("Campaigns&action"))
			{
				break;
			}
		}
	}
	public void clickdropDown(WebElement ele,String data) {
		Select select = new Select(ele);
		select.selectByValue(data);
	}
	public void alertHandle(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public static String takeScreenShortEx(WebDriver driver,String screenShotName) throws Throwable{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/"+screenShotName+".png");
		FileUtils.copyFile(src, dest);
		return dest.getAbsolutePath();
		
	}
}
