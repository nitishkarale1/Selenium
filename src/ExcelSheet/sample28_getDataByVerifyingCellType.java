package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample28_getDataByVerifyingCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet Sh = WorkbookFactory.create(F).getSheet("Sheet1");
		
		Cell cellinfo = Sh.getRow(1).getCell(3);
		
		CellType celltype = cellinfo.getCellType();
		
		
		if (celltype==CellType.STRING)		
		{
			String S = cellinfo.getStringCellValue();
			System.out.println(celltype);
			System.out.println(S);
		}
		
		else if (celltype==CellType.NUMERIC)
		{
			double N = cellinfo.getNumericCellValue();
			System.out.println(celltype);
			System.out.println(N);
		}
		
		else if (celltype==CellType.BOOLEAN)
		{
			boolean B = cellinfo.getBooleanCellValue();
			System.out.println(celltype);
			System.out.println(B);
		}
		
		
	}
}
