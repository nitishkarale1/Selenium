package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample19_getAllDataByVerifyingCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream IND=new FileInputStream("D:\\Software Testing\\selenium\\sample_Sheet2.xlsx");
		Sheet sh = WorkbookFactory.create(IND).getSheet("Sheet1");
		
		Cell info = sh.getRow(3).getCell(2);
		
		CellType Ctype = info.getCellType();
		
		if (Ctype==CellType.STRING)
		{
			System.out.println(Ctype +": "+ info.getStringCellValue());
		}
		
		else if (Ctype==CellType.BOOLEAN)
		{
			System.out.println(Ctype +": "+ info.getBooleanCellValue());
		}
		
		else if (Ctype==CellType.NUMERIC)
		{
			System.out.println(Ctype+": "+info.getNumericCellValue());
		}
		
		
		
		
		
		
		
		
		
	}
}
