package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample4_Annotations 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open Browser",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("login To App",true);
	}
	
	@Test
	public void verifyUSerID1()
	{
		Reporter.log("--running verify UserID1 TC--",true);
	}
	

	@Test
	public void verifyUserID2()
	{
		Reporter.log("--running verify UserID2 TC--",true);
	}
	

	@Test
	public void verifyUserID3()
	{
		Reporter.log("--running verify UserID3 TC--",true);
	}
	

	@Test
	public void verifyUserID4()
	{
		Reporter.log("--running verify UserID4 TC--",true);
	}
	
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("logout From App",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close Browser",true);
	}
}
