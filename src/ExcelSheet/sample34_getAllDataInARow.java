package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample34_getAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sample_Sheet2.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int LCI = Sh.getRow(1).getLastCellNum()-1;
		
		for (int i=0; i<=LCI; i++)
		{
			Cell cellinfo = Sh.getRow(1).getCell(i);
			CellType S1 = cellinfo.getCellType();
			
				if (S1==CellType.STRING)
				{
					String value = cellinfo.getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if (S1==CellType.NUMERIC)
				{
					double value = cellinfo.getNumericCellValue();
					System.out.print(value+" ");
				}
				
				else if (S1==CellType.BOOLEAN)
				{
					boolean value = cellinfo.getBooleanCellValue();
					System.out.print(value+" ");
			    }
				
		}
	}
}
