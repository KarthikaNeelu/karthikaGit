package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class methods {

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void wait(WebDriver driver ) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
