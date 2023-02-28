package POM_With_DDF2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ChromeOptions Option=new ChromeOptions();
		Option.addArguments("--disable-notifications");
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet SH = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(Option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		KiteLogin1Page Login1=new KiteLogin1Page(driver);
		Login1.inpKiteLogin1PageUserName(SH.getRow(0).getCell(0).getStringCellValue());
		Login1.inpKiteLogin1PagePassword(SH.getRow(0).getCell(1).getStringCellValue());
		Login1.ClickKiteLogin1PageLoginBtn();
		
		KiteLogin2Page Login2=new KiteLogin2Page(driver);
		Login2.inpKiteLogin2PagePin(SH.getRow(0).getCell(2).getStringCellValue());
		Login2.ClickKiteLogin2PageCntBtn();
		
		KiteHomePage Home=new KiteHomePage(driver);
		Home.VerifyUserID(SH.getRow(0).getCell(3).getStringCellValue());
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}
