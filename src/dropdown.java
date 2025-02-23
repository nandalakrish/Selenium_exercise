import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     		
			WebDriver driver = new ChromeDriver();
			
			Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         			
			
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Nanda");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Chennai Chitlappakam");
		
		driver.findElement(By.xpath("//input[@type='email']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcd123@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("0726565656");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click(); 
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		List<WebElement> options =driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li"));
		
		System.out.println("No. of options are: "+options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//select[@id='Skills']")).click();
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select dropdown = new Select(drop1);
		
		dropdown.selectByIndex(2);
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("India");
		
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
		
		WebElement drop2 = driver.findElement(By.id("yearbox"));
		 
		Select year = new Select(drop2); 
		
		year.selectByValue("1993");
		
		
		WebElement month =driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
        Select Monthdd = new Select(month);
        
        Monthdd.selectByVisibleText("September");
        
        WebElement Days = driver.findElement(By.id("daybox"));
        
        Select Daysdd = new Select(Days);
        
        Daysdd.selectByValue("21");
        
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("abc@123");
        
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("abc@123");
        
       // driver.findElement(By.id("submitbtn")).click();
        
        driver.findElement(By.id("imagesrc")).click();
	}
	
	}
