package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3_getStringData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
//		Workbook book = WorkbookFactory.create(F);
//		
//		Sheet sh = book.getSheet("Sheet1");
//		
//		Row rw = sh.getRow(8);
//		
//		Cell cl = rw.getCell(6);
//		
//		String value = cl.getStringCellValue();
//		
//		System.out.println(value);
	
		String value = WorkbookFactory.create(F).getSheet("Sheet1").getRow(8).getCell(6).getStringCellValue();
		
		System.out.println(value);

	}
	
}
