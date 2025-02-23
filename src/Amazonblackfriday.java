import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonblackfriday {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		String searchitem = "Limited Time Deal";
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchitem);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		 String title = driver.getTitle();
			System.out.println("Parent window title: "+ driver.getTitle());
		
			List<WebElement> deals = driver.findElements(By.xpath("//*[text()='Limited time deal']"));
			
			System.out.println("Total Black friday deals in this page: "+deals.size());
		 
JavascriptExecutor js2 =  (JavascriptExecutor) driver;
		
		WebElement next1 = driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-button-accessibility s-pagination-separator']"));
		
		js2.executeScript("arguments[0].scrollIntoView();",next1);
		
		next1.click();
		
		Thread.sleep(3000);
		
		for(WebElement blackfridaydeals: deals)
		{
		
		if(title.contains("searchitem"))
		{
		
			Thread.sleep(3000);
			
			List<WebElement> deals1 = driver.findElements(By.xpath("//*[text()='Limited time deal']"));
			
			System.out.println("Total Limited time deal in this page: "+deals1.size());
		
		JavascriptExecutor js1 =  (JavascriptExecutor) driver;
		
		WebElement next = driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-button-accessibility s-pagination-separator']"));
		
		js1.executeScript("arguments[0].scrollIntoView();",next);
		
		Thread.sleep(3000);
		
		next.click();
		
		Thread.sleep(3000);
		
		}
		
		
		else
		{
			
		}
	}}

}
