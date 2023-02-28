package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample7_keyword1_invocationCount 
{
	@Test(invocationCount = 4)
	public void verifyMobileNumber()
	{
		Reporter.log("--running Verify Mobile Number",true);
	}
	
}
