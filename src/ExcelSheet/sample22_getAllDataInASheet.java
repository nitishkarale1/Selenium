package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample22_getAllDataInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		
			int lastRowIndex = Sh.getLastRowNum();
		
			for (int i=0; i<=lastRowIndex; i++)  //outer for loop -->rows
			{
			    int lastCellIndex = Sh.getRow(i).getLastCellNum()-1;
			
			    for (int j=0; j<=lastCellIndex; j++)   //inner for loop -->columns
			    {
				    String S = Sh.getRow(i).getCell(j).getStringCellValue();
				
				    System.out.print(S+"  ");
		     	}
			    System.out.println();
			    System.out.println();
			
			}
		
	}
}
