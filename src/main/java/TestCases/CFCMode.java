package TestCases;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import Keys.Keywords;

public class CFCMode {
	
	@SuppressWarnings("rawtypes")
	static ArrayList<Comparable> a;
	static Keywords key;
	
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		
		FileInputStream file = new FileInputStream("recipeCreationCFCMode.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		Sheet s = workbook.getSheet("ModeCF");

		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			String sheetName = workbook.getSheetName(i);
			System.out.println(sheetName);
			Sheet sheet = workbook.getSheet(sheetName);
			ArrayList a1 = readData(sheet);
			System.out.println(a1);
			runCase(a1);
		}
//			@SuppressWarnings("rawtypes")		
//			Iterator itr = s.iterator();
//			while (itr.hasNext()) {
//				Row rowitr = (Row) itr.next();
//				@SuppressWarnings("rawtypes")
//				Iterator cellitr = rowitr.cellIterator();
//				while (cellitr.hasNext()) {
//					Cell celldata = (Cell) cellitr.next();
//					switch (celldata.getCellType()) {
//					case NUMERIC:
//						a.add(celldata.getNumericCellValue());
//						break;
//					case STRING:
//						a.add(celldata.getStringCellValue());
//						break;
//					case BOOLEAN:
//						a.add(celldata.getBooleanCellValue());
//						break;
//					default:
//						break;
//					}
//				}
//			}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList<Comparable> readData(Sheet s) {
		ArrayList list = new ArrayList();
		System.out.println();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Row rowitr = (Row) itr.next();
			@SuppressWarnings("rawtypes")
			Iterator cellitr = rowitr.cellIterator();
			while (cellitr.hasNext()) {
				Cell celldata = (Cell) cellitr.next();
				switch (celldata.getCellType()) {
				case NUMERIC:
					list.add(celldata.getNumericCellValue());
					break;
				case STRING:
					list.add(celldata.getStringCellValue());
					break;
				case BOOLEAN:
					list.add(celldata.getBooleanCellValue());
					break;
				default:
					break;
				}
			}
		}

		return list;

	}
	@Test
	public static void runCase(ArrayList a) throws Exception {
		key = new Keywords();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).equals("openBrowser")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i + 1);
				String objectName = (String) a.get(i + 2);
				String runmode = (String) a.get(i + 3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if (runmode.equals("yes")) {
					key.openBrowser();
				}
			}

			if (a.get(i).equals("navigate")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i + 1);
				String objectName = (String) a.get(i + 2);
				String runmode = (String) a.get(i + 3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if (runmode.equals("yes")) {
					key.navigate(data);
				}
			}

			if (a.get(i).equals("intNavigation")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i + 1);
				String objectName = (String) a.get(i + 2);
				String runmode = (String) a.get(i + 3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if (runmode.equals("yes")) {
					key.intNavigation(data);
				}
			}

			if (a.get(i).equals("closeWindow")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i + 1);
				String objectName = (String) a.get(i + 2);
				String runmode = (String) a.get(i + 3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if (runmode.equals("yes")) {
					key.closeWindow();
				}
			}

			if (a.get(i).equals("click")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i + 1);
				String objectName = (String) a.get(i + 2);
				String runmode = (String) a.get(i + 3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if (runmode.equals("yes")) {
					key.click(objectName);
				}

			}
			if (a.get(i).equals("input")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i + 1);
				String objectName = (String) a.get(i + 2);
				String runmode = (String) a.get(i + 3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if (runmode.equals("yes")) {
					key.input(data, objectName);
				}
			}

			if (a.get(i).equals("radio")) {
				String keyword = (String) a.get(i);
				String data = (String) a.get(i + 1);
				String objectName = (String) a.get(i + 2);
				String runmode = (String) a.get(i + 3);
				System.out.println(keyword);
				System.out.println(data);
				System.out.println(objectName);
				System.out.println(runmode);
				if (runmode.equals("yes")) {
					key.radio(objectName);
				}
			}

		}
	}
}
