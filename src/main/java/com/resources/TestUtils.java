package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtils {
	public static Workbook book;
	public static Sheet sheet;

	public static Object[][] getTestData(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\SampleTest.xlsx"));

		book = WorkbookFactory.create(fis);
		sheet = book.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}
		return data;

	}

}
