package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample2_get_Numeric_Data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(1).getNumericCellValue();
		
		System.out.println(value);
	}
	
	
}
