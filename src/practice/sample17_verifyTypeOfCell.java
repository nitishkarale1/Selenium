package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample17_verifyTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		CellType celltype = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getCellType();
		
		System.out.println(celltype);

	}
}
