package Testngprog;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testngsample1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Thread.sleep(6000);
		
String parentpagename = driver.getTitle();
		
		System.out.println(parentpagename);
		
		Actions act = new Actions(driver);
		
		
		
		WebElement phone1 = driver.findElement(By.xpath("//a[text()='Nexus 6']"));
		
		act.moveToElement(phone1).perform();
		
		phone1.sendKeys(Keys.CONTROL,Keys.ENTER);
		
		//act.keyDown(Keys.CONTROL).keyDown(Keys.ENTER).keyUp(Keys.CONTROL).keyUp(Keys.ENTER).perform();
		
		Thread.sleep(3000);	
		
		Set<String> windids = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windids);
		
		String parentwin=windows.get(0);
		String childwin= windows.get(1);
		
		driver.switchTo().window(childwin);
		
		
		
		String childpagename = driver.getTitle();
		
		System.out.println(childpagename);
		
		Thread.sleep(3000);		
		
		String producttext= driver.findElement(By.xpath("//div[@id='more-information']")).getText();
	
	    System.out.println(producttext);
	    
	    driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
	    
	  // Alert Alr = new Alert(driver);
	    
	    Thread.sleep(4000);
	    
	    Alert alert = driver.switchTo().alert();
	    
	    String poptext =     driver.switchTo().alert().getText();
	    
	   alert.accept();
	   
	
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("cartur")).click();
	    
	    Thread.sleep(2000);
	    
	 String phonename =    driver.findElement(By.xpath("//td[normalize-space()='Nexus 6']")).getText();
	    
	 System.out.println("Product in cart: "+phonename);
	 
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nanda");
	        
	    driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
	    
	    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
	    
	    driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1234 5678 1234");
	    
	    driver.findElement(By.xpath("//input[@id='month']")).sendKeys("May");
	    
	    driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2000");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
	    
	    Thread.sleep(3000);
	    
	  WebElement purchasebtn =  driver.findElement(By.xpath("//p[@Class='lead text-muted ']"));
	
	 System.out.println( purchasebtn.getText());
	
  }



  
}
