package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample18_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int LastCellIndex = Sh.getRow(3).getLastCellNum()-1;
		
		for(int i=0; i<=LastCellIndex; i++)
		{
			String s1 = Sh.getRow(3).getCell(i).getStringCellValue();
			System.out.print(s1+" ");
		}
		
		
		
	}
}
