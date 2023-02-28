package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample6_readNumericDataAsAString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
		System.out.println(value);
	}
	
}
