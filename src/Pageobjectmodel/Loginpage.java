
package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	  By username =   By.xpath("//input[@placeholder='Username']");
	  
	   By password =   By.xpath("//input[@placeholder='Password']");
	   
	   By loginbtn = By.xpath("//button[@type='submit']");
	   
	   public void usernamelogin(String login)
	   {
		   driver.findElement(username).sendKeys(login);
	   }
	
	   public void passwordlogin(String pass)
	   {
		   driver.findElement(password).sendKeys(pass);
	   }
	   
	   public void loginbtton()
	   {
		   driver.findElement(loginbtn).click();
	   }
}
