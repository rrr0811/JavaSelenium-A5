package org.generic_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Harsha G R
 */
public class FLib {

	/**
	 * This is a method which is used to fetch the value from a properties file
	 * @param key
	 * @return value 
	 */
	public static String readDataFromProperties(String key) {
		File f = new File("./TestData/config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	/**
	 * This method is used to fetch the data present in a cell,
	 * in the given Excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return data present in the cell
	 */
	public static String readDataFromExcel(String sheetName, int rowIndex, int cellIndex) {
		File f = new File(".\\TestData\\DWS.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
		return data;
	}
}
