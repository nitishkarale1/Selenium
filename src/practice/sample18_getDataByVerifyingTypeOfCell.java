package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample18_getDataByVerifyingTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		Cell cellInfo = sh.getRow(1).getCell(1);
		
		CellType S1 = cellInfo.getCellType();
		
		if (S1==CellType.STRING)  //(String == String)
		{
			String A1 = cellInfo.getStringCellValue();
			System.out.println(S1);
			System.out.println(A1);
		}
		
		else if (S1==CellType.NUMERIC)
		{
			double A2 = cellInfo.getNumericCellValue();
			System.out.println(S1);
			System.out.println(A2);
		}
		
		else if (S1==CellType.BOOLEAN)
		{
			boolean A3 = cellInfo.getBooleanCellValue();
			System.out.println(S1);
			System.out.println(A3);
		}
			
	}
}
