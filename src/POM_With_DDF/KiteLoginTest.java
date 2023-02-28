package POM_With_DDF;

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
import org.openqa.selenium.grid.data.NewSessionResponse;

import POM_With_DDF.KiteLogin1Page;

public class KiteLoginTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
				
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		KiteLogin1Page Login1=new KiteLogin1Page(driver);
		Login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		Login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		Login1.clickKiteLogin1PageLoginBtn();
		
		KiteLogin2Page Login2=new KiteLogin2Page(driver);
		Login2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		Login2.ClickKiteLogin2PageCntBtn();
		
		KiteHomePage Home=new KiteHomePage(driver);
		Home.VerifyKiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
