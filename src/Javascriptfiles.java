import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascriptfiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement Addon =	driver.findElement(By.xpath("//li[@class='post-160 product type-product status-publish has-post-thumbnail product_cat-selenium product_tag-ruby product_tag-selenium has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock downloadable taxable shipping-taxable purchasable product-type-simple']//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart'][normalize-space()='Add to basket']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", Addon);
		
		System.out.println(js.executeScript("return window.pageYOffset;")); //1346
		
		js.executeScript("arguments[0].click();", Addon);
		
		System.out.println("All done");
	}

}
