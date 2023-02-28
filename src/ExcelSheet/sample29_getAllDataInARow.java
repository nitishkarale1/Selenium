package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample29_getAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sample_Sheet2.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastCellIndex = Sh.getRow(0).getLastCellNum()-1;
		

		for (int i=0; i<=lastCellIndex; i++)
		{  
			Cell cellinfo = Sh.getRow(0).getCell(i);
			CellType celltype = cellinfo.getCellType();
			
			if (celltype==celltype.STRING)
			{
				String value = cellinfo.getStringCellValue();
				System.out.print(value+" ");
			}
		
			else if (celltype==CellType.NUMERIC)
			{
				double value = cellinfo.getNumericCellValue(); 
				System.out.print(value+" ");
			}
			
			else if (celltype==CellType.BOOLEAN)
			{
				boolean value = cellinfo.getBooleanCellValue();
				System.out.print(value+" ");
			}
			
		}
		
		
		
		
		
	}
}
