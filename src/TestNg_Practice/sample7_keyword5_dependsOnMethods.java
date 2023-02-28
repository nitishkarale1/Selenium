package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample7_keyword5_dependsOnMethods 
{
	@Test
	public void login1() 
	{
		Reporter.log("running TC login1",true);
	}
	
	@Test (dependsOnMethods="login1")
	public void login2() 
	{
		Reporter.log("running TC login2",true);
	}
	
	@Test (dependsOnMethods= {"login1","login2"})
	public void logOut() 
	{
		Reporter.log("running TC logOut",true);
	}
	
}
