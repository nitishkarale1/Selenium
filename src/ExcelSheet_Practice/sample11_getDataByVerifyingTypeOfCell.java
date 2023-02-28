package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample11_getDataByVerifyingTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		Cell cellInfo = sh.getRow(2).getCell(2);
		CellType clType = cellInfo.getCellType();
		
		if(clType==CellType.STRING)
		{
			System.out.print(cellInfo.getStringCellValue());
		}
		
		else if(clType==CellType.NUMERIC)
		{
			System.out.print(cellInfo.getNumericCellValue());
		}
		
		else if (clType==CellType.BOOLEAN)
		{
			System.out.print(cellInfo.getBooleanCellValue());
		}
		
	}
	
}
