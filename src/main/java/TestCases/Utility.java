package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Keys.Keywords;

public class Utility {
	static Keywords key = new Keywords();
	
	public XSSFWorkbook pickWorkbooks(String pathExcel) throws IOException {
		FileInputStream file = new FileInputStream(pathExcel);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		file.close(); 
		return workbook;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static ArrayList<Comparable> readData(Sheet s) {
		ArrayList list = new ArrayList();
		System.out.println();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Row rowitr = (Row) itr.next();
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static ArrayList runCase(ArrayList<?> a) throws Exception {
		key = new Keywords();
		ArrayList aList = new ArrayList();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).equals("openBrowser")) {
				ArrayList testData = new ArrayList();
				String des = (String) a.get(i - 1);
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
					testData.add(des);
					testData.add(keyword);
					testData.add(data);
					testData.add(objectName);
				}
				if (testData.size() > 0) {
					testData.add("Pass");
					aList.add(testData);
				}
				System.out.println(testData);
			}

			if (a.get(i).equals("navigate")) {
				ArrayList testData = new ArrayList();
				String des = (String) a.get(i - 1);
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
					testData.add(des);
					testData.add(keyword);
					testData.add(data);
					testData.add(objectName);
				}
				if (testData.size() > 0) {
					testData.add("Pass");
					aList.add(testData);
				}
				System.out.println(testData);
			}

			if (a.get(i).equals("intNavigation")) {
				ArrayList testData = new ArrayList();
				String des = (String) a.get(i - 1);
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
					testData.add(des);
					testData.add(keyword);
					testData.add(data);
					testData.add(objectName);
				}
				if (testData.size() > 0) {
					testData.add("Pass");
					aList.add(testData);
				}
				System.out.println(testData);
			}

			if (a.get(i).equals("closeWindow")) {
				ArrayList testData = new ArrayList();
				String des = (String) a.get(i - 1);
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
					testData.add(des);
					testData.add(keyword);
					testData.add(data);
					testData.add(objectName);
				}
				if (testData.size() > 0) {
					testData.add("Pass");
					aList.add(testData);
				}
				System.out.println(testData);
			}

			if (a.get(i).equals("click")) {
				ArrayList testData = new ArrayList();
				String des = (String) a.get(i - 1);
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
					testData.add(des);
					testData.add(keyword);
					testData.add(data);
					testData.add(objectName);
				}
				if (testData.size() > 0) {
					testData.add("Pass");
					aList.add(testData);
				}
				System.out.println(testData);
			}
			if (a.get(i).equals("input")) {
				ArrayList testData = new ArrayList();
				String des = (String) a.get(i - 1);
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
					testData.add(des);
					testData.add(keyword);
					testData.add(data);
					testData.add(objectName);
				}
				if (testData.size() > 0) {
					testData.add("Pass");
					aList.add(testData);
				}
				System.out.println(testData);
			}

			if (a.get(i).equals("radio")) {
				ArrayList testData = new ArrayList();
				String des = (String) a.get(i - 1);
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
					testData.add(des);
					testData.add(keyword);
					testData.add(data);
					testData.add(objectName);
				}
				if (testData.size() > 0) {
					testData.add("Pass");
					aList.add(testData);
				}
				System.out.println(testData);
			}

		}
		return aList;
	}

}
