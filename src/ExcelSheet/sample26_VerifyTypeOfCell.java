package ExcelSheet;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample26_VerifyTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
			
		System.out.println("========");
		
		CellType CellType1 = Sh.getRow(2).getCell(2).getCellType();
		
		System.out.println(CellType1);
		
		System.out.println("========");
		
		CellType CellType2 = Sh.getRow(4).getCell(2).getCellType();
		
		System.out.println(CellType2);
		
		System.out.println("========");
		
	}
	
}
