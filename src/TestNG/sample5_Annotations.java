package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample5_Annotations 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser",true);
	}
	
	@BeforeMethod
	public void loginToApplication() 
	{
		Reporter.log("Login To Application",true);
	}
	
	@Test
	public void verifyUserID1()
	{
		Reporter.log("--Running Verify UserID1 TC",true);
	}
	
	@Test
	public void verifyUserID2()
	{
		Reporter.log("--Running_Verify_UserID2_TC",true);
	}
	
	@Test
	public void verifyUserID3()
	{
		Reporter.log("--Running_Verify_UserID3_TC",true);
	}
	
	@Test
	public void verifyUserID4()
	{
		Reporter.log("--Running_Verify_UserID4_TC",true);
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		Reporter.log("Logout From Application",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Browser",true);
	}
	
}	
