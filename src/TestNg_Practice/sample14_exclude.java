package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample14_exclude 
{
	@Test
	public void country()
	{
		Reporter.log("India",true);
	}
	
	@Test
	public void state() 
	{
		Reporter.log("Maharashtra",true);
	}
	
	@Test
	public void city() 
	{
		Reporter.log("Pune",true);
	}
	
}
