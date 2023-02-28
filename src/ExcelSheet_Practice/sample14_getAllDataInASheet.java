package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample14_getAllDataInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastRowIndex=sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			int lastCellIndex=sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=lastCellIndex; j++)
			{
				Cell cellInfo = sh.getRow(i).getCell(j);
				CellType clType = cellInfo.getCellType();
				
				if(clType==CellType.STRING)
				{
					String value=cellInfo.getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if (clType==CellType.NUMERIC) 
				{
					double value=cellInfo.getNumericCellValue();
					System.out.print(value+" ");
				}
				
				else if(clType==CellType.BOOLEAN)
				{
					boolean value=cellInfo.getBooleanCellValue();
					System.out.print(value+" ");
				}
				
			}
			System.out.println();
		}
	}
	
}
