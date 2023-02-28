package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample23_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet SH = WorkbookFactory.create(F).getSheet("Sheet4");
		
		int LRI = SH.getLastRowNum();
		
		for (int a=0; a<=LRI; a++)
		{
			int LCI = SH.getRow(a).getLastCellNum()-1;
			
			for (int b=0; b<=LCI; b++)
			{
				String value = SH.getRow(a).getCell(b).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
			
		}
	
	
	
	
	
	
	
	}
}
