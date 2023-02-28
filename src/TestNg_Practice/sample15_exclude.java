package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample15_exclude 
{
	@Test
	public void country()
	{
		Reporter.log("USA",true);
	}
	
	@Test
	public void state() 
	{
		Reporter.log("Florida",true);
	}
	
	@Test
	public void city() 
	{
		Reporter.log("Miami",true);
	}
	
}
