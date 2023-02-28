package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample25_VerifyTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream F=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet SH = WorkbookFactory.create(F).getSheet("Sheet1");
		
		CellType CellTypes1 = SH.getRow(6).getCell(1).getCellType();
		
		System.out.println(CellTypes1);
		
	}
}
