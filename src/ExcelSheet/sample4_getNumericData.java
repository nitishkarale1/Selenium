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

public class sample4_getNumericData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\StudentData.xlsx");
//		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
//		System.out.println(value);
		
		Workbook book = WorkbookFactory.create(file);
		Sheet Sheet1 = book.getSheet("Sheet1");
		Row R = Sheet1.getRow(2);
		Cell C = R.getCell(4);
		double value = C.getNumericCellValue();
		System.out.println(value);
	}
}
