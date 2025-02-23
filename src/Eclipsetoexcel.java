import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eclipsetoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	
		String currurl = driver.getCurrentUrl();
		
		
		FileOutputStream file = new FileOutputStream("E:\\Eclipse-workspace\\Selenium_exercise\\Excel\\test5.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow Row1 = sheet.createRow(0);
		Row1.createCell(0).setCellValue(currurl);
		
		/*
		Row1.createCell(1).setCellValue("is");
		Row1.createCell(2).setCellValue("good");
		Row1.createCell(3).setCellValue("boy");
		
		XSSFRow Row2 = sheet.createRow(1);
		Row2.createCell(0).setCellValue("Nanda");
		Row2.createCell(1).setCellValue("is");
		Row2.createCell(2).setCellValue("looking");
		Row2.createCell(3).setCellValue("good");
		 */
		workbook.write(file);
		
		workbook.close();
		
		file.close();
		
		System.out.println("File created....");
	}

}
