import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		/*
		File targetss = ts.getScreenshotAs(OutputType.FILE);
		File savepath = new File("C:\\Users\\Nandha Kumar\\Desktop\\Screenshots\\ss1.png");
		
		targetss.renameTo(savepath);
		*/
		
		WebElement particularss =driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]"));	
		
		File targetss = particularss.getScreenshotAs(OutputType.FILE);
		File savein = new File("C:\\Users\\Nandha Kumar\\Desktop\\Screenshots\\ss2.png");
		targetss.renameTo(savein);
		
	
	}

}
