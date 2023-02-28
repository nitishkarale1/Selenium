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


public class sample2_getStringDataFromExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\StudentData.xlsx");
//		Workbook book = WorkbookFactory.create(file);
//		
//		Sheet Sh = book.getSheet("Sheet1");
//		
//		Row Rw = Sh.getRow(0);
//		
//		Cell Cl = Rw.getCell(1);
//		
//		String value = Cl.getStringCellValue();
//		
//		System.out.println(value);
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value);
	}
}
