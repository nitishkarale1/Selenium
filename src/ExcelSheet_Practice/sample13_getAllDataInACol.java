package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample13_getAllDataInACol
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sample_Sheet2.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastRowIndex=sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			Cell cellInfo = sh.getRow(i).getCell(0);
			CellType clType = cellInfo.getCellType();
			
			if(clType==CellType.STRING)
			{
				String value=cellInfo.getStringCellValue();
				System.out.println(value);
			}
			else if (clType==CellType.NUMERIC)
			{
				double value = cellInfo.getNumericCellValue();
				System.out.println(value);
			}
			
			else if (clType==CellType.BOOLEAN)
			{
				boolean value=cellInfo.getBooleanCellValue();
				System.out.println(value);
			}
			
		}
		
		
	}
	
}
