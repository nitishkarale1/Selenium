package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	
	//Author Name= Nitish
	//This method is use to get the test data from excel sheet
	//Need to pass 2 inputs: 1:rowIndex  2:colIndex
	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\TestData\\sampleSheet.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = Sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
}
