package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample15_getColSizeInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		short colsize = WorkbookFactory.create(F).getSheet("Sheet1").getRow(1).getLastCellNum();
		
		System.out.println(colsize);
		
		
		
	}
}
