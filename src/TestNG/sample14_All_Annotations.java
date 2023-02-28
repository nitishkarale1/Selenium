package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample14_All_Annotations 
{
	@Test(priority = 2, invocationCount = 2)
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(priority = 3)
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(priority = 1)
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	
	@Test(priority = 4, timeOut = 5000)
	public void TC4() 
	{
		
		Reporter.log("running TC4",true);
	}
	
	@Test(priority = 5, dependsOnMethods = {"TC1","TC2"})
	public void TC5()
	{
		Reporter.log("running TC5",true);
	}
	
	@Test(priority = 5,enabled = false)
	public void TC6()
	{
		Reporter.log("running TC6",true);
	}
	
}
