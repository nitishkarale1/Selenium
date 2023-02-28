package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample9_getRowSizeInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream A=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		int rowsize = WorkbookFactory.create(A).getSheet("Sheet1").getLastRowNum()+1;
		
		System.out.println(rowsize);
	}
}
