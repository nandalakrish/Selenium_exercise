import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.microsoft.schemas.office.office.TitleAttribute;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		Thread.sleep(3000);
		
		
		String currurl = driver.getCurrentUrl();
		System.out.println("PArent window url: "+currurl);
		Set<String> Windowids = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String>(Windowids);
		
		
		String parentid = windowlist.get(0);
		String childid= windowlist.get(1);
		
		driver.switchTo().window(childid);
		System.out.println("childwindow heading is: "+driver.getTitle());

		driver.switchTo().window(parentid);
		System.out.println("parentwindow heading is: "+driver.getTitle());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		Thread.sleep(3000);
		
		for(String togglewind:Windowids)
		{
			
		
			
			
		}
		
		/*
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).keyDown(Keys.TAB).keyUp(Keys.TAB).keyUp(Keys.CONTROL).perform();


          */
}}
