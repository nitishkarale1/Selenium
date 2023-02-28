package POM_DDF_TestNG_BaseClass_UtilityClass3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class 
{
	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspacee\\Selenium\\TestData\\instagramCrd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
}
