import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("Parent window URL: "+ driver.getCurrentUrl());
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TV");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(6000);
		
		//driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal' and contains(text(),'ONIDA 108 cm (43 inch)')]")).click();
	
		WebElement tv1 = driver.findElement(By.xpath("(//div[@class='rush-component s-featured-result-item ']//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		   
		tv1.click();
		
	    System.out.println(driver.getCurrentUrl());
	
	    Thread.sleep(7000);
	    
Set<String> Windowids = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String>(Windowids);
		
		
		//String parentid = windowlist.get(0);
		String childid= windowlist.get(1);
		
		driver.switchTo().window(childid);
		
		Thread.sleep(2000);
		System.out.println("childwindow heading is: " +driver.getTitle());
	    
	  //  WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='ape_Detail_desktop-detail-ilm_desktop_iframe']"));
	   // driver.switchTo().frame(frame1);
	    
	WebElement addcart =    driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"));
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	
	js1.executeScript("arguments[0].scrollIntoView();", addcart);
	
	Thread.sleep(3000);
	
	addcart.click();
	   	
	  // WebDriverWait wait=new WebDriverWait(driver, 20);
	
	  // WebElement clikable =  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button"));
	
	  // clikable.click();
	
	  // Thread.sleep(5000);
	    
	//WebElement framee =    driver.findElement(By.id("ape_Detail_ams-detail-right-v2_desktop_iframe"));
	    
	  //  driver.switchTo().frame(framee);
	    
	    Thread.sleep(7000);
	    
	WebElement text =     driver.findElement(By.xpath("//span[@id='attach-accessory-proceed-to-checkout-text']"));
	
	
	
	System.out.println("Total number of products in cart is: "+ text.getText());
	
	}

}
