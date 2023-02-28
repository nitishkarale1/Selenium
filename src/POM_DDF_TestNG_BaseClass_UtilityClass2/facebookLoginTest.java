package POM_DDF_TestNG_BaseClass_UtilityClass2;

import java.io.FileInputStream;
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
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class facebookLoginTest extends Base_Class
{
	facebookLoginPage login;
	facebookHomePage home;
	
	@Parameters("BrowserName")
	@BeforeClass 
	public void openBrowser(String BrowserName) throws EncryptedDocumentException, IOException
	{		
		initializeBrowser(BrowserName);
		
		login=new facebookLoginPage(driver);
		home=new facebookHomePage(driver);
		
	}
	
	@BeforeMethod
	public void LoginToFacebook() throws EncryptedDocumentException, IOException
	{
		login.inpFacebookLoginPageUserName(Utility_Class.getTD(0, 0));
		login.inpFacebookLoginPagePasswaord(Utility_Class.getTD(0, 1));
		login.clickFacebookLoginPageLoginBtn();
	}
	
	@Test 
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		String exp_UserID=Utility_Class.getTD(0, 2);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(home.getFacebookHomePageUserID(), exp_UserID,"Failed: both USerID's Are different.");
		
		soft.assertAll();
		Reporter.log("runnig very UserID TC",true);
	}
	
//	@AfterMethod
//	public void logoutFromFacebook()
//	{
//		
//	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
