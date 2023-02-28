package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5_getColSizeInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		int colSize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getLastCellNum();
		System.out.println(colSize);
	}
	
}
