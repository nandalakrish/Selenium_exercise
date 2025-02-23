package Pageobjectmodel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver driver;
	
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchbox = By.xpath("//input[@placeholder='Search']");
	
	By logoutdrop = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");

	By logout = By.xpath("//a[normalize-space()='Logout']");
	
	public void searchboxf()
	{
		assertEquals(true, true);
	}
	
	public void logoutdropf()
	
	{
		driver.findElement(logoutdrop).click();
		}
	
	
	public void logoutf()
	{
		driver.findElement(logout).click();
		}
	
	
}
