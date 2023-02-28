package POM_DDF_TestNG;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KiteLoginTest 
{
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage Home;
	Sheet Sh;
	WebDriver driver;
	
	
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(String browserName) throws EncryptedDocumentException, IOException
	{
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"D:\\Software Testing\\selenium\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("Chrome")) 
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(option);
		}
		else if(browserName.equals("Edge"))
		{
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.edge.driver",
					"D:\\Software Testing\\selenium\\edge driver\\msedgedriver.exe");
			driver=new EdgeDriver(option);
		}
		
		
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sh = WorkbookFactory.create(file).getSheet("DDF");
		
		login1=new KiteLogin1Page(driver); 
		login2=new KiteLogin2Page(driver);
		Home=new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		login1.inpkiteLogin1pageUserName(Sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(Sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLogin1pageLoginbtn();
		
		login2.inpKiteLogin2pagePin(Sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickKitelogin2PageCntBtn();
	}
	
	@Test
	public void verifyUserID()
	{
		String actualUserID = Home.getKiteHomePageUserID();
		String expUserID = Sh.getRow(0).getCell(3).getStringCellValue();
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualUserID, expUserID);
		
		Reporter.log("running verifyUserID",true);
		//Assert.assertEquals(actualUserID, expUserID);
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		Thread.sleep(3000);
		Home.clickKiteHomePagelogOut(driver);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
}
