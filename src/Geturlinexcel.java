import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturlinexcel {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		String url =  driver.getCurrentUrl();
		
		String title =  driver.getTitle();
		
		
		FileOutputStream file = new FileOutputStream("E:\\Eclipse-workspace\\Selenium_exercise\\Excel\\test6.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		XSSFRow row = sheet.createRow(0);
		
		XSSFCell cell = row.createCell(1);
		
		cell.setCellValue(url);
		
		XSSFCell cell2 = row.createCell(2);
		
		cell2.setCellValue(title);
		
		workbook.write(file);
		
		workbook.close();
		
		file.close();
		
		file.close();
		
		
		
		
		
	}
}

