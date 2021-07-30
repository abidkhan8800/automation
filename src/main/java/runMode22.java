import TestCases.Utility;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class runMode22 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		Utility u = new Utility();
		XSSFWorkbook w =  u.pickWorkbooks("testing.xlsx");
//		for(int i = 0; i < w.getNumberOfSheets(); i++) {
//			String sheetName = w.getSheetName(i);
//			Sheet sheet = w.getSheet(sheetName);
//			@SuppressWarnings("rawtypes")
//			ArrayList<Comparable> sheetData = Utility.readData(sheet);
//			@SuppressWarnings("rawtypes")
//			ArrayList caseData = Utility.runCase(sheetData);
//		}
		String sheetName = w.getSheetName(0);
		Sheet sheet = w.getSheet(sheetName);
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> sheetData = Utility.readData(sheet);
		@SuppressWarnings("rawtypes")
		ArrayList caseData = Utility.runCase(sheetData);
		System.out.println(caseData);
	}
}
