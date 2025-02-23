import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class uploadfile {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();	
	  driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\Nandha Kumar\\Desktop\\Azure Dumps.txt");
		
	}
}
	
	
	

