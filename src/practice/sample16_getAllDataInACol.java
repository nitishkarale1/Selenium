package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample16_getAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastrowindex = sh.getLastRowNum();
		System.out.println(lastrowindex);
		
		System.out.println("===========");
		
		for (int i=0; i<=lastrowindex; i++)
		{
			String value = sh.getRow(i).getCell(3).getStringCellValue();
			System.out.println(value);
		}
		
	}
}