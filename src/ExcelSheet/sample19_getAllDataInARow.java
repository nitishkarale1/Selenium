package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample19_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
	
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			
		int lastCellIndex = sh.getRow(1).getLastCellNum()-1;
		System.out.println(lastCellIndex);
		
		
		for(int i=0; i<=lastCellIndex; i++)
		{
			String s1 = sh.getRow(1).getCell(i).getStringCellValue();
			System.out.print(s1+" ");
		}
	}
}
