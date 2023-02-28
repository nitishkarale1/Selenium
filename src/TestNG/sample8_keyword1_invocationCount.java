package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample8_keyword1_invocationCount 
{
	@Test(invocationCount = 2)
	public void verifyFont()
	{
		Reporter.log("--Running Verify Font",true);
	}
	
}
