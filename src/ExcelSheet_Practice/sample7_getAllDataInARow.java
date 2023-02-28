package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample7_getAllDataInARow
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastcellIndex=sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastcellIndex; i++)
		{
			String value=sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
	}
	
}
