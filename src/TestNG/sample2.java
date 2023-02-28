package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2
{
	@Test(timeOut = 4000,priority = 2,invocationCount = 2)
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("running TC4",true);
	}
	
}
