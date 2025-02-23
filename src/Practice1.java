import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		//WebDriver driver;
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		FileReader reader = new FileReader("E:\\Eclipse-workspace\\Selenium_exercise\\Dataproperties.properties\\Selniumprog1.properties");
		
		Properties props = new Properties();
		
		props.load(reader);
		
		driver.navigate().to(props.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(props.getProperty("name"));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(props.getProperty("email"));
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7299118877");
		
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("No. 89, ram st, chitlapakkam,chennai");
	
	   driver.findElement(By.id("male")).click();
	   
	    java.util.List<WebElement> List = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
	
	   for(int i=0;i<List.size();i++)
	   {
		   List.get(i).click();
		  Thread.sleep(1000);
	   }
	    
	   Thread.sleep(2000);
	      WebElement    country = driver.findElement(By.xpath("//select[@id='country']"));
	    Select drop = new Select(country);
	    
	    drop.selectByIndex(2);
	    
	    
	    Thread.sleep(2000);
	      WebElement    colours = driver.findElement(By.xpath("//select[@id='colors']"));
	    Select colour = new Select(colours);
	    
	    colour.selectByValue("yellow");
	    
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
	  
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(2000);
	  
driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
	  
	 Alert prompt =  driver.switchTo().alert();
	  
	 prompt.sendKeys("Nanda");
	 
	 prompt.accept();
	  
	  Thread.sleep(2000);
	  
	  Actions act = new Actions(driver);
	  
	  driver.findElement(By.xpath("//input[@id='field1']")).clear();
	  
	  driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("I am Nanda");
	  
	 WebElement cbutton =  driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	  
	  act.doubleClick(cbutton).build().perform();
	  
	  Thread.sleep(2000);
	String f1 =   driver.findElement(By.xpath("//input[@id='field1']")).getAttribute("value");
	  
	String f2 = driver.findElement(By.xpath("//input[@id='field2']")).getText();
	
	System.out.println(f1);
	
	System.out.println(f2);
	
	  Thread.sleep(2000);
	  
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement dropele = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	
	act.dragAndDrop(drag, dropele).perform();
	
	 Thread.sleep(2000);
	
	WebElement slide = driver.findElement(By.xpath("//*[@id='slider']"));
	
	
	//act.moveToElement(slide, 930,1111).perform();
	
	Thread.sleep(2000);
	
	System.out.println(slide.getLocation());
	
	
	 WebElement frame1  =driver.findElement(By.id("frame-one796456169"));
	driver.switchTo().frame(frame1);
	
	
	driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-0\"]")).sendKeys("Helloo..");
	
	act.moveToElement( driver.findElement(By.id("RESULT_RadioButton-1_0"))).click().perform();
	
	driver.findElement(By.id("RESULT_TextField-2")).sendKeys("09/21/1995");
	
	Thread.sleep(3000);
	
	WebElement fd = driver.findElement(By.id("RESULT_RadioButton-3"));
	
	Select framdrop = new Select(fd);
	
	framdrop.deselectByIndex(2);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='FSsubmit']")).click();
	
	
	driver.switchTo().parentFrame();
	
	
	
	
	
	
	
	    }
	
	
	
	
	
	
	
	
	
	}


