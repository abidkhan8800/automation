package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KR2i2heads {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("recipeCreationKR2i2Heads.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		file.close(); 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			String sheetName = workbook.getSheetName(i);
			System.out.println(sheetName);
			
			Sheet sheet = workbook.getSheet(sheetName);
			@SuppressWarnings({ "rawtypes" })
			ArrayList a1 = Utility.readData(sheet);
			System.out.println(a1);
			Utility.runCase(a1);

		}
		
	}

	

}
