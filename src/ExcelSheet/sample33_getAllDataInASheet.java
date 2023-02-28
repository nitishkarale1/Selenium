package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample33_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\StudentData.xlsx");
		
		Sheet sh = WorkbookFactory.create(F).getSheet("Sheet1");
		
		int LRI = sh.getLastRowNum();
		System.out.println(LRI);
		
		for (int a=0; a<=LRI; a++)  //outer for loop--->rows
		{
			int LCI = sh.getRow(a).getLastCellNum()-1;
			
				for (int b=0; b<=LCI; b++)  //inner for loop--->column
				{
					Cell cellinfo = sh.getRow(a).getCell(b);
					CellType celltype1 = cellinfo.getCellType();
					
					if (celltype1==CellType.NUMERIC)
					{
						double N = cellinfo.getNumericCellValue();
						System.out.print(N+"  ");
					}
					
					else if (celltype1==CellType.BOOLEAN)
					{
						boolean B = cellinfo.getBooleanCellValue();
						System.out.print(B+"  ");
					}
					
					else if (celltype1==CellType.STRING)
					{
						String S = cellinfo.getStringCellValue();
						System.out.print(S+"  ");
					}
					
				}
				System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
