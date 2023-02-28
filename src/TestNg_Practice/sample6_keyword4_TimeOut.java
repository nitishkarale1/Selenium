package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample6_keyword4_TimeOut
{
	@Test (timeOut=2000)
	public void TestCase1() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("running Test Case1",true);
	}

	@Test
	public void TestCase2()
	{
		Reporter.log("running Test Case2",true);
	}
	
}
