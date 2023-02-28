package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample31_getAllDataInCol 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		int lastRowIndex = sh.getLastRowNum();	
	
		
		for (int i=0; i<=lastRowIndex; i++)
		{
			
			Cell info = sh.getRow(i).getCell(0);
			CellType type = info.getCellType();
			
			if (type==CellType.STRING)
			{
				System.out.println(info.getStringCellValue());
			}
			
			else if (type==CellType.NUMERIC)
			{
				System.out.println(info.getNumericCellValue());
			}
			
			else if (type==CellType.BOOLEAN)
			{
				System.out.println(info.getBooleanCellValue());
			}
			
			
//			Cell cellinfo = sh.getRow(i).getCell(0);
//			CellType celltype1 = cellinfo.getCellType();
//			
//			if (celltype1==CellType.STRING)
//			{
//				String value = cellinfo.getStringCellValue();
//				System.out.println(value);
//			}
//			
//			else if (celltype1==CellType.NUMERIC)
//			{
//				double value = cellinfo.getNumericCellValue();
//				System.out.println(value);
//			}
//			
//			else if (celltype1==CellType.BOOLEAN)
//			{
//				boolean value = cellinfo.getBooleanCellValue();
//				System.out.println(value);
//			}
			
		}
		
	}
	
}
