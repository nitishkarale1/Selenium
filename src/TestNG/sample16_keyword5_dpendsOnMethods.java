package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample16_keyword5_dpendsOnMethods 
{
	@Test
	public void login1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void login2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(dependsOnMethods = {"login1","login2"})
	public void logOut()
	{
		Reporter.log("running TC1",true);
	}
	
	
	
}
