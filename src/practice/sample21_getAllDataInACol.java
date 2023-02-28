package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample21_getAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int cellindex = sh.getLastRowNum();		
		
		
		for (int i=0; i<=cellindex; i++)
		{
			Cell info = sh.getRow(i).getCell(1);
			CellType type = info.getCellType();
			
			if (type==CellType.STRING)
			{
				System.out.println(info.getStringCellValue());
			}
			
			else if (type==CellType.NUMERIC)
			{
				System.out.println(info.getNumericCellValue());
			}
			
			else if (type==CellType.BOOLEAN)
			{
				System.out.println(info.getBooleanCellValue());
			}
			
		}
		
	}
}
