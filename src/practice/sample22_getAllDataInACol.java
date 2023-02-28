package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class sample22_getAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream IND=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet Sh = WorkbookFactory.create(IND).getSheet("sheet7");
		
		int lastRowIndex = Sh.getLastRowNum();
		
		for (int i=0; i<=lastRowIndex; i++)
		{
			Cell cellInfo = Sh.getRow(i).getCell(1);
			CellType s1 = cellInfo.getCellType();
			
			if (s1==CellType.STRING)
			{
				String value = cellInfo.getStringCellValue();
				System.out.println(value);
			}
			else if (s1==CellType.NUMERIC)
			{
				double value = cellInfo.getNumericCellValue();
				System.out.println(value);
			}
			else if (s1==CellType.BOOLEAN)
			{
				boolean value = cellInfo.getBooleanCellValue();
				System.out.println(value);
			}
			
		}
	
//		for(int i=0; i<=lastRowIndex; i++) 
//		{  
//			Cell cellInfo = Sh.getRow(i).getCell(1);
//			CellType s1 = cellInfo.getCellType();
//			
//			if(s1==CellType.STRING) 
//			{
//				String value = cellInfo.getStringCellValue();
//				System.out.println(value);
//			}
//			else if (s1==CellType.NUMERIC)
//			{
//				double value = cellInfo.getNumericCellValue();
//				System.out.println(value);
//			}			else if (s1==CellType.BOOLEAN)
//			{
//				boolean value = cellInfo.getBooleanCellValue();
//				System.out.println(value);
//			}
//		}
		
	}
}
