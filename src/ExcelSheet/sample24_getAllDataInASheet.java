package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample24_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx"); 
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=lastCellIndex; j++)
			{
				String A1 = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(A1+" ");
			}
			System.out.println();
			
		}
		
	}
	
}
