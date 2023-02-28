package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample5_keyword3_priority 
{
	@Test(priority=3) //duplicate priority
	public void TestCase1() 
	{
		Reporter.log("running Test Case1",true);
	}
	
	@Test               // by default priority should be 0
	public void TestCase2() 
	{
		Reporter.log("running Test Case2",true);
	}
	
	@Test(priority=3) //duplicate priority
	public void TestCase3() 
	{
		Reporter.log("running Test Case3",true);
	}
	
	@Test(priority=1) 
	public void TestCase4() 
	{
		Reporter.log("running Test Case4",true);
	}
	
	@Test(priority=2)
	public void TestCase5() 
	{
		Reporter.log("running Test Case5",true);
	}
	
	@Test(priority=-1) //priority can be negative 
	public void TestCase6() 
	{
		Reporter.log("running Test Case6",true);
	}
}
