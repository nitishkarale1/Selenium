package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample15_keyword4_timeout 
{
	@Test(timeOut = 4000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("running TC1",true);
	}
	
	@Test(timeOut = 4000)
	public void TC2() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("running TC2",true);
	}
}
