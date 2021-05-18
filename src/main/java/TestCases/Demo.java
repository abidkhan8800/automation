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

public class Demo {

	public static void main(String[] args) throws Exception {
			@SuppressWarnings("rawtypes")
			ArrayList<Comparable> a = new ArrayList<Comparable>();
			Keywords key = new Keywords();
			FileInputStream file = new FileInputStream("recipeCreationTests.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			//Sheet s = workbook.getSheet("cModeCF");
			
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {

                System.out.println("Sheet name: " + workbook.getSheetName(i));
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

}
