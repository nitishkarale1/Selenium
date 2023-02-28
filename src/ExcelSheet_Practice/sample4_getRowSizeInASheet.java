package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample4_getRowSizeInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		int rowSize=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(rowSize);
	}
	
}
