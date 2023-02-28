package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample24_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\data of employees.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)   // out for loop--> rows
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=lastCellIndex; j++)   //inner for loo-->columns
			{
				Cell cellInfo = sh.getRow(i).getCell(j);
				CellType s1 = cellInfo.getCellType();
	
				if(s1==CellType.STRING)
				{
					String value = cellInfo.getStringCellValue();
					System.out.print(value+"   ");
				}
				else if(s1==CellType.NUMERIC)
				{
					double value = cellInfo.getNumericCellValue();
					System.out.print(value+"   ");
				}
				else if(s1==CellType.BOOLEAN)
				{
					boolean value = cellInfo.getBooleanCellValue();
					System.out.print(value+"   ");
				}
				
			}
			System.out.println();
			
		}
					
	}
}
	

