package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample9_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex=sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			int lasyCellIndex=sh.getRow(i).getLastCellNum()-1;
			for(int j=0; j<=lasyCellIndex; j++)
			{
				String Value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(Value+" ");
			}
			System.out.println();
		}
		
	}
	
}
