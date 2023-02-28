package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1_Emailable_Report 
{
	@Test
	public void TestCase1()
	{
		Reporter.log("sum="+ (20+30),true);
	}
	
	@Test
	public void TestCase2()
	{
		Reporter.log("subtraction="+ (30-10),true);
	}
	
	@Test
	public void TestCase3()
	{
		Reporter.log("division="+ (20/5),true);
	}
	
}
