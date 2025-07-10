package ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.methods;

public class Debugging1 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     methods data = new methods();
     data.maximizeWindow(driver);
     data.wait(driver);
     driver.findElement(By.name("q")).sendKeys("puma");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
