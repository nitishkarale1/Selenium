package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample12_include 
{
	@Test
	public void Addition()
	{
		Reporter.log("sum="+ (20+30),true);
	}
	
	@Test
	public void Multiplication() 
	{
		Reporter.log("multiplication="+ (20*5),true);
	}
	
	@Test
	public void division() 
	{
		Reporter.log("division="+ (20/5),true);
	}
	
}
