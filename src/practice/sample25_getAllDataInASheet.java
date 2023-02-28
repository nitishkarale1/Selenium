package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample25_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\data of employees.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int a=0; a<=lastRowIndex; a++)
		{
			int lastCellIndex = sh.getRow(a).getLastCellNum()-1;
			
			for(int b=0; b<=lastCellIndex; b++)
			{
				Cell cellinfo = sh.getRow(a).getCell(b);
				CellType s1 = cellinfo.getCellType();
				
				if(s1==CellType.STRING)
				{
					String value = cellinfo.getStringCellValue();
					System.out.print(value+"  ");
				}
				else if(s1==CellType.NUMERIC)
				{
					double value = cellinfo.getNumericCellValue();
					System.out.print(value+"  ");
				}
				else if(s1==CellType.BOOLEAN)
				{
					boolean value = cellinfo.getBooleanCellValue();
					System.out.print(value+"  ");
				}
			}
			System.out.println();
		}
		
		
	}
}
