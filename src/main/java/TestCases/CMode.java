package TestCases;

import java.io.FileInputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CMode {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("recipeCreationCMode.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			String sheetName = workbook.getSheetName(i);
			System.out.println(sheetName);
			Sheet sheet = workbook.getSheet(sheetName);
			@SuppressWarnings({ "rawtypes" })
			ArrayList a1 = Utility.readData(sheet);
			System.out.println(a1);
			Utility.runCase(a1);

		}
		file.close();
	}
}
