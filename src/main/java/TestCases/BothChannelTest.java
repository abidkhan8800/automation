package TestCases;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BothChannelTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("recipeCreationWithUVCh1andUVCh2.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		file.close(); 
		
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			String sheetName = workbook.getSheetName(i);
			System.out.println(sheetName);
			Sheet sheet = workbook.getSheet(sheetName);
			
			try {
				@SuppressWarnings({ "rawtypes" })
				ArrayList a1 = Utility.readData(sheet);
				System.out.println(a1);
				@SuppressWarnings("rawtypes")
				ArrayList testOutput = Utility.runCase(a1);

			}catch(Exception e) {
				
			}
		}
		
	}
}
