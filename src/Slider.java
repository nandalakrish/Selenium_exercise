import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://demo.automationtesting.in/Slider.html");
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	             	 	
	
	/*
	
	WebElement firstlocation = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
	
	 System.out.println( "First location is  " +firstlocation.getLocation()); //(328, 282)

	
	act.dragAndDropBy(firstlocation, 450, 282).perform();
	
	 System.out.println( "final"
	 		+ " location is  " +firstlocation.getLocation());
	  */
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
	
	act.keyDown(Keys.SHIFT).sendKeys("N").keyUp(Keys.SHIFT).sendKeys("anda").perform();
	}

}
