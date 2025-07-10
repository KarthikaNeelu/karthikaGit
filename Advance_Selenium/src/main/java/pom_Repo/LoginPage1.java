package pom_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
  //locators
	private WebDriver driver;
   private By userTextfield=By.name("user_name");
   private By passWordTextfield=By.name("user_password");
   private By logiButton=By.id("submitButton");
   
   //constructor
   public LoginPage1(WebDriver driver) {
	   this.driver=driver;
   }
   public void enterUsername(String username) {
	   WebElement userInput = driver.findElement(userTextfield);
	   userInput.sendKeys(username);
   }
   public void enterPassword(String password) {
	   WebElement passwordInput = driver.findElement(passWordTextfield);
	   passwordInput.sendKeys(password);
   }
   public void clickLoginButton() {
	  WebElement loginbutton = driver.findElement(logiButton);
	  loginbutton.click();
   }
   public void loginToAPPv(String name,String password) {
	   enterUsername(name);
	   enterPassword(password);
	   
	  
   }
   
   
}
