import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_blogspot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.automationtesting.in/Slider.html");
	//driver.get("https://demo.automationtesting.in/Register.html");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		/*
	WebElement interation = driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
	
	
		
	WebElement dandd = driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']"));
	
	WebElement Staticc = driver.findElement(By.xpath("//a[normalize-space()='Static']"));
	
	act.moveToElement(interation).moveToElement(dandd).moveToElement(Staticc).click().perform();
	
	    Thread.sleep(3000);
	    
	 WebElement startpic =  driver.findElement(By.id("angular"));
	 
	 WebElement droppic = driver.findElement(By.xpath("//div[@id='droparea']"));
	 
	 act.dragAndDrop(startpic, droppic).perform();
	
	   */
		
		WebElement doubled = 	driver.findElement(By.xpath("//input[@id='field1']"));
		
		driver.findElement(By.xpath("//input[@id='field1']")).clear();
		
		driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("Nanda");
		
		 Thread.sleep(3000);
		
	WebElement doublec = 	driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
	
	act.doubleClick(doublec).build().perform();
	
	
	System.out.println("gettext method: "+doubled.getText());
	
	System.out.println("getatrribute method: "+doubled.getAttribute("value"));
	
	
	
	
	}

}
