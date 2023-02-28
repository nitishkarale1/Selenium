package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi.sha256WithSM2;

public class sample37_GetAllDataInARow__GetAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet7");
		
		int LastCellIndex = Sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=LastCellIndex; i++)
		{
			Cell cellInfo = Sh.getRow(3).getCell(i);
			CellType Ctype = cellInfo.getCellType();
			if(Ctype==CellType.STRING)
			{
				System.out.print(cellInfo.getStringCellValue()+"  ");
			}
			else if(Ctype==CellType.NUMERIC)
			{
				System.out.print(cellInfo.getNumericCellValue()+"  ");
			}
			else if(Ctype==CellType.BOOLEAN)
			{
				System.out.println(cellInfo.getBooleanCellValue());
			}
			
		}
		
		

		for(int j=0; j<=Sh.getLastRowNum(); j++)
		{
			Cell CellInfo = Sh.getRow(j).getCell(2);
			CellType CType = CellInfo.getCellType();
			
			if(CType==CellType.STRING)
			{
				System.out.println(CellInfo.getStringCellValue());
			}
			else if(CType==CellType.NUMERIC)
			{
				System.out.println(CellInfo.getNumericCellValue());
			}
			else if(CType==CellType.BOOLEAN)
			{
				System.out.println(CellInfo.getBooleanCellValue());
			}
		}
		
		
	}
}
