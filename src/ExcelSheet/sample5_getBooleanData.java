package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5_getBooleanData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\StudentData.xlsx");
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(2).getBooleanCellValue();
		System.out.println(value);
	}
}
