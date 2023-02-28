package POM_DDF_TestNG_BaseClass_UtilityClass1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("DDF");
		String value=Sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
}
