package POM_DDF_TestNG_BaseClass_UtilityClass2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.common.value.qual.StaticallyExecutable;

public class Utility_Class 
{
	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspacee\\Selenium\\TestData\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet8");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
}
