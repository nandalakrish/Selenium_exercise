import java.time.Duration;
import java.util.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class totalcountamazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String searchproduct = "washing machine front load";

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		   driver.manage
		   
		   
		   
		   
		   
		   
		   ().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		   
		  // String title = driver.getTitle();
		//System.out.println("Parent window URL: "+ driver.getTitle());
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchproduct);
		
		Thread.sleep(3000);
		
		WebElement Searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(6000);
		   String title = driver.getTitle();
			System.out.println("Parent window title: "+ driver.getTitle());
		
	List<WebElement> counts = 	driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	
	System.out.println("Total links in first page: "+counts.size());
	
	
	
	WebElement next = driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));
	
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	
	js2.executeScript("arguments[0].scrollIntoView();",next);
	
	Thread.sleep(2000);
	
	next.click();
	
	Thread.sleep(4000);
	
	
	
	for(WebElement Tvc: counts)
	{
	
		if (title.contains(searchproduct))
		{
			Thread.sleep(3000);
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			
			WebElement next1 = driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));
			
			js3.executeScript("arguments[0].scrollIntoView();",next1);
			
			Thread.sleep(2000);
			
			List<WebElement> linktext =driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			
			for(WebElement linkt:linktext)
				{
				System.out.println("Product title: "+linkt.getText()+"  \n");
				
				}
			System.out.println("Total links in other pages: "+counts.size()+"  \n");
			
			next1.click();
			
			Thread.sleep(3000);
		}
	
		else
		{
			WebElement next2 = driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));
			
			Assert.assertNull(next2);
		}
	}
	
	
	
	
	
	}

}
