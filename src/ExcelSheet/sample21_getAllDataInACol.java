package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample21_getAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastrowindex = Sh.getLastRowNum();
		
		for(int i=0; i<=lastrowindex; i++)
		{
			String S = Sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(S);
		}
		
	}
}
