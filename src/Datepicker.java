import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String Date = "21";
	String month = "September";
	String year = "1993";
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	
	while(true)
	{
	
	  String currmonth=   driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	  String curryear =   driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	if( month.equals(currmonth) && year.equals(curryear))
		
	{
		
		break;
	}
	
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	}
	
	  List<WebElement> getdate =   driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//td//a"));
	
	    for(WebElement alldate:getdate)
	    {
	    	if(alldate.getText().equals(Date))
	    	{
	    		alldate.click();
	    		break;
	    	}
	    }
	    
	    driver.findElement(By.xpath("//input[@id='datepicker2']")).sendKeys("09/21/1993");
	    driver.findElement(By.xpath("//input[@id='datepicker2']")).sendKeys(Keys.ENTER);
	}

	
	
	}
 