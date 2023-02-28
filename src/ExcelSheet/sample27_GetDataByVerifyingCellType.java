package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample27_GetDataByVerifyingCellType
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet SH = WorkbookFactory.create(F).getSheet("Sheet5");
		
		Cell CellInfo = SH.getRow(0).getCell(0);
		
		CellType CellType1 = CellInfo.getCellType();
		
	
		if (CellType1==CellType1.STRING)
		{
			String S1 = CellInfo.getStringCellValue();
			System.out.println(S1);
		}
		
		else if (CellType1==CellType.NUMERIC)
		{
			double S2 = CellInfo.getNumericCellValue();
			System.out.println(S2);
		}
		
		else if (CellType1==CellType.BOOLEAN)
		{
			boolean S3 = CellInfo.getBooleanCellValue();
			System.out.println(S3);
		}
		
		
	}
}
