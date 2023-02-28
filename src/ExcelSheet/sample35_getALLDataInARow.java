package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample35_getALLDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sample_Sheet2.xlsx");
		Sheet sh = WorkbookFactory.create(F).getSheet("Sheet1");
	
		int LastCellIndex = sh.getRow(0).getLastCellNum()-1;
		
		for (int i=0; i<=LastCellIndex; i++)
		{
			Cell cellinfo = sh.getRow(0).getCell(i);
			
			CellType celltype = cellinfo.getCellType();
			
			if (celltype==CellType.NUMERIC)
			{
				double N = cellinfo.getNumericCellValue();
				System.out.print(N+" ");
			}
			
			else if (celltype==CellType.STRING)
			{
				String S = cellinfo.getStringCellValue();
				System.out.print(S+" ");
			}
			
			else if (celltype==CellType.BOOLEAN)
			{
				boolean B = cellinfo.getBooleanCellValue();
				System.out.print(B+" ");
			}
		}
	
	
	}
}
