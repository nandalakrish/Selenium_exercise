import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.automationtesting.in/Slider.html");
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		
	WebElement interation = driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
	
	
		
	WebElement dandd = driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']"));
	
	act.moveToElement(interation).moveToElement(dandd);
	
	
	}

}
