package POM_With_DDF_TestNG1;

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

public class facebookLoginTest 
{
	WebDriver driver=null;
	facebookLoginPage login;
	facebookHomePage home;
	Sheet sh;
	
	@Parameters("BrowserName")
	@BeforeClass 
	
	public void openBrowser(String BrowserName) throws EncryptedDocumentException, IOException
	{
		if(BrowserName.equals("Chrome"))
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}
		
//		else if(BrowserName.equals("Firefox"))
//		{
//			FirefoxOptions option1=new FirefoxOptions();
//			option1.addArguments("--disable-notifications");
//			driver=new FirefoxDriver(option1);
//		}
		
		else if(BrowserName.equals("Edge"))
		{
			EdgeOptions option2=new EdgeOptions();
			option2.addArguments("--disable-notifications");
			driver=new EdgeDriver(option2);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		FileInputStream file=new FileInputStream("F:\\Software Testing\\selenium\\sampleSheet.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet8");
		
		login=new facebookLoginPage(driver);
		home=new facebookHomePage(driver);
		
	}
	
	@BeforeMethod
	public void LoginToFacebook()
	{
		login.inpFacebookLoginPageUserName(sh.getRow(0).getCell(0).getStringCellValue());
		login.inpFacebookLoginPagePasswaord(sh.getRow(0).getCell(1).getStringCellValue());
		login.clickFacebookLoginPageLoginBtn();
	}
	
	@Test 
	public void verifyUserID()
	{
		String exp_UserID=sh.getRow(0).getCell(2).getStringCellValue();
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
