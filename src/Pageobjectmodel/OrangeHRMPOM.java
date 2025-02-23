package Pageobjectmodel;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMPOM {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		
		
		FileReader HRM = new FileReader("E:\\Eclipse-workspace\\Selenium_exercise\\src\\Pageobjectmodel\\POM.properties");
		Properties pom = new Properties();
		pom.load(HRM);
		
		driver.get(pom.getProperty("HRMurl"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(5000);
		
		
		
		//creating the objects of specific class
		Homepage hp = new Homepage(driver);
		
		Loginpage lp = new Loginpage(driver);
		
		lp.usernamelogin("Admin");
		
		lp.passwordlogin("admin123");
		
		lp.loginbtton();
		
		Thread.sleep(3000);
		
		hp.logoutdropf();
		
		Thread.sleep(2000);
		
		hp.logoutf();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
