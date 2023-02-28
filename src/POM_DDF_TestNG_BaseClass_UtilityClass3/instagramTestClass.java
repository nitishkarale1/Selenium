package POM_DDF_TestNG_BaseClass_UtilityClass3;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class instagramTestClass extends Base_Class
{
	instagramLoginPage login;
	instagramHomePage home;
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		login=new instagramLoginPage(driver);
		home=new instagramHomePage(driver);
	}
	
	
	@BeforeMethod
	public void LoginToInstagram() throws EncryptedDocumentException, IOException
	{
		login.inpInstagramLoginPageUserName(Utility_Class.getTD(0, 0));
		login.inpInstagramLoginPagePassword(Utility_Class.getTD(0, 1));
		login.clickInstagramLogiPageLoginBTN();
	}
	
	@Test
	public void verifyUserID_Name() throws EncryptedDocumentException, IOException
	{
		home.clickInstagramHomnePageNotNowBtn();
		home.clickInstagramHomePageturnOnNotificationNotNowBtn();
		home.clickInstagramHomePageProfile();
	
		SoftAssert soft=new SoftAssert();		
		
		String exp_UserID=Utility_Class.getTD(0, 2);
		soft.assertEquals(home.getInstagramHomePageUserID(), exp_UserID,"Failed: Both UserID's are different.");
		
		String exp_postsCount=Utility_Class.getTD(0, 3);
		soft.assertEquals(home.getInstagramHomePageName(),exp_postsCount,"Failed: Both Names are differernt.");
		
		Reporter.log("running verifyUserID_Name TC",true);
		soft.assertAll();
		
	}
	
	@AfterMethod
	public void LogoutFromInstagram() throws InterruptedException
	{
		home.clickInstagramHomePageMore(driver);
		Thread.sleep(2000);
		home.clickInstagramHomePageLogoutBtn();
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}
	
}
