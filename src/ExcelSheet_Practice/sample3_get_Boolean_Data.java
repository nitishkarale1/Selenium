package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3_get_Boolean_Data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(2).getBooleanCellValue();
		System.out.println(value);
		
	}
	
}
