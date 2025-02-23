import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordian {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Accordion.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='panel-group']//div[1]//div[1]//h4[1]")).click();
    
	
	
	
	}
}