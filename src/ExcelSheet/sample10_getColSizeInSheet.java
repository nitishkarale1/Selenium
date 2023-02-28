package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample10_getColSizeInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(F).getSheet("Sheet1");
		  short colsize = sh.getRow(1).getLastCellNum();
		
		System.out.println("colsize: "+colsize);
		
		int rowsize =sh.getLastRowNum()+1;
		System.out.println("rowsize: "+rowsize);
	}
}
