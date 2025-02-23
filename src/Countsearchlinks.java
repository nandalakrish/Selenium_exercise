import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countsearchlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		Thread.sleep(3000);
		
	int links = 	driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//a")).size();
	
	System.out.println(links);
	
List<String> linkss = 	driver.findElement(By.xpath("//div[@class='wikipedia-search-results']//a"));
	
	
	}

}
