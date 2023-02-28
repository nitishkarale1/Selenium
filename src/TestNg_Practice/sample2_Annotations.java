package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample2_Annotations
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("running TC openBrowser",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("running TC login",true);
	}
	
	@Test
	public void verifyUserID()
	{
		Reporter.log("runnig TC verifyUserID",true);
	}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("running TC logOut",true);
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("running TC closeBrowser",true);
	}
}
