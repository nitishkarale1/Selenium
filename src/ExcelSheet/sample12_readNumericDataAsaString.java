package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample12_readNumericDataAsaString
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		String S1 = WorkbookFactory.create(F).getSheet("Sheet1").getRow(6).getCell(2).getStringCellValue();
		
		System.out.println(S1);
		
	}
}
