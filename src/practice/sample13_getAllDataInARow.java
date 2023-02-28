package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample13_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastcellindex = sh.getRow(8).getLastCellNum()-1;
		
		for (int i=0; i<=lastcellindex; i++)
		{
			String value = sh.getRow(8).getCell(i).getStringCellValue();
			System.out.print(value + " ");
		}
		
		
	}
}
