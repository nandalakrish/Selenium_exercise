import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltoeclipse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   
		
		FileInputStream file = new FileInputStream("E:\\Eclipse-workspace\\Selenium_exercise\\Excel\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();
		
		int totalcells =sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows: "+totalrows);
		
		System.out.println("Total cells: "+totalcells);
		
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow rows = sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++)
			{
				
				XSSFCell cells = rows.getCell(c);
				System.out.print(cells.toString()+"\t");
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
