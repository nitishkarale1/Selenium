package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFiles_CaptureSSofOnlyFailedTCes;

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
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KiteLoginTest extends Baseclass
{
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage Home;
	int TCID;
	
	//@Parameters("browserName")
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{		
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver(option);
//    	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://kite.zerodha.com/");
		
		initializeBrowser();
		
		login1=new KiteLogin1Page(driver); 
		login2=new KiteLogin2Page(driver);
		Home=new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login1.inpKiteLogin1PageUserName(UtilityClass.getPFdata("UN"));
		login1.inpKiteLogin1PagePassword(UtilityClass.getPFdata("PWD"));
		login1.clickKiteLogin1PageLoginBtn();
		
		login2.inpKiteLogin2PagePin(UtilityClass.getPFdata("PIN"));
		login2.clickKitelogin2PageCntBtn();
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		TCID=101;
		String actualUserID = Home.getKiteHomePageUserID();
		String expUserID = UtilityClass.getTD(0, 3);
		Assert.assertEquals(actualUserID, expUserID,"Failed: both results are diff ");
	}
	
	@AfterMethod
	public void logOut(ITestResult result) throws InterruptedException, IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver, TCID);
		}
		
		Thread.sleep(3000);
		Home.logoutKiteHomePageLogOut(driver);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
}
