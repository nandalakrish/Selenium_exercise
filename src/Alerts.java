import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		String alerts =  driver.switchTo().alert().getText();
		  System.out.println("Text on ok alert is: "+alerts);
		driver.switchTo().alert().accept();
		
		
		// alert 2
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK &')]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		String alert2 = driver.switchTo().alert().getText();
		 System.out.println("Text on ok cancel alert is: "+alert2);
		driver.switchTo().alert().dismiss();
		
		//alert 3
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Helloooo");
		driver.switchTo().alert().accept();
	
	}

}
