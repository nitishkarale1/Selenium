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

public class sample4_getNumericData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sample_Sheet2.xlsx");
		
//		Workbook book = WorkbookFactory.create(file);
//		
//		Sheet sh = book.getSheet("Sheet1");
//		
//		Row rw = sh.getRow(1);
//		
//		Cell cl = rw.getCell(3);
//		
//		double value = cl.getNumericCellValue();
//		
//		System.out.println(value);
		
		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		
		System.out.println(value);
		
	}
}
