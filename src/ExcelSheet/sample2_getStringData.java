package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class sample2_getStringData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\selenium sheet.xlsx");
//		Workbook book = WorkbookFactory.create(F);
//		Sheet Sheet1 = book.getSheet("Sheet1");
//		Row R = Sheet1.getRow(1);
//		Cell C = R.getCell(4);
//		String result = C.getStringCellValue();
//		System.out.println(result);
		
		String result = WorkbookFactory.create(F).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(result);
	}
}
