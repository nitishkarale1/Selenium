 package POM_DDF_TestNG_BaseClass_UtilityClass1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteLoginTest extends BaseClass
{
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage Home;
	
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(String browserName)
	{
		initializeBrowser(browserName);
		
		login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
		Home=new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException 
	{
		login1.inpkiteLogin1pageUserName(UtilityClass.getTD(0, 0));
		login1.inpKiteLogin1PagePassword(UtilityClass.getTD(0, 1));
		login1.clickKiteLogin1pageLoginbtn();
		
		login2.inpKiteLogin2pagePin(UtilityClass.getTD(0, 2));
		login2.clickKitelogin2PageCntBtn();
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		String actualUserID = Home.getKiteHomePageUserID();
		String expUserID = UtilityClass.getTD(0, 3);
		Assert.assertEquals(actualUserID, expUserID,"Failed: bothe results are diff ");
	}
	
	@AfterMethod
	public void logoutApp()
	{
		Home.LogOut(driver);
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{ 
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
}
