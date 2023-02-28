package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample13_include 
{
	@Test
	public void Addition()
	{
		Reporter.log("sum="+ (150+25),true);
	}
	
	@Test
	public void multiplication() 
	{
		Reporter.log("multiplication="+ (4*80),true);
	}
	
	@Test
	public void division() 
	{
		Reporter.log("division="+ (50/2),true);
	}
	
}
