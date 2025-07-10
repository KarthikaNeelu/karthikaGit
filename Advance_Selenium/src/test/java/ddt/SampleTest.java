package ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Repo.LoginPage1;
import pom_Repo.LoginPage2;

public class SampleTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		LoginPage2 login=new LoginPage2(driver);
		//login.enterUsername("admin");
		//login.enterPassword("Admin@123");
		//login.clickLoginButton();
		login.loginTpVTiger("admin", "Admin@123");
	}

}
