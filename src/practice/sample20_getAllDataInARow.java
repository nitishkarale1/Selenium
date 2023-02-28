
package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample20_getAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sample_Sheet2.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowIndex = sh.getRow(1).getLastCellNum()-1;
		
		for (int i=0; i<=rowIndex; i++)
		{
			Cell info = sh.getRow(1).getCell(i);
			CellType type = info.getCellType();
			
			if (type==CellType.STRING)
			{
				System.out.print(info.getStringCellValue()+" ");
			}
			
			else if (type==CellType.NUMERIC)
			{
				System.out.print(info.getNumericCellValue()+" ");
			}
			
			else if  (type==CellType.BOOLEAN)
			{
				System.out.print(info.getBooleanCellValue()+" ");
			}
			
		}
		
	}
	
}
