package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class sample32_getAllDataInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet7");
		
		int lastRowIndex = sh.getLastRowNum();
		
						
				for (int i=0; i<=lastRowIndex; i++)
				{
					int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			
					for (int j=0; j<=lastCellIndex; j++)
					{
						Cell cellinfo = sh.getRow(i).getCell(j);
						CellType celltype = cellinfo.getCellType();
					
						if (celltype==CellType.STRING)
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
					System.out.println();
		}

	}
}
