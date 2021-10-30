package com.tests;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.resources.TestUtils;

public class ExcelImplement {
	
	public String sheetName="contacts";
	
	@DataProvider(name="getData")
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		Object[][] data=TestUtils.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getData")
	public void validateData(String name,String city,String country)
	{
		System.out.println("First Name: "+name);
		System.out.println("City Name: "+city);
		System.out.println("Country Name: "+country);
		System.out.println("**************************");
	}

}
