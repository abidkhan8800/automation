package TestCases;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import TestCases.Utility;
public class CDCMode {
	static Utility u = new Utility();
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("recipeCreationCDCMode.xlsx");
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

	}
}
