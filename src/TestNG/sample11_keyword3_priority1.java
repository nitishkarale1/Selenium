package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample11_keyword3_priority1 
{
	@Test(priority=1)
	public void TC3()
	{
		//System.out.println("running TC3");
		Reporter.log("running TC3",true);
	}
	
	@Test(priority=1)
	public void TC2()
	{
		//System.out.println("running TC2");
		Reporter.log("running TC2",true);
	}
	
	@Test(priority=3)
	public void TC1()
	{
		//System.out.println("running TC1");
		Reporter.log("running TC1",true);
	}
	
}
