package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample9_keyword2_enabled 
{
	@Test
	public void verifyUserID1()
	{
		Reporter.log("--Running Verify UserID1 TC",true);
	}

	@Test(enabled = false)
	public void verifyUserID2()
	{
		Reporter.log("--Running Verify UserID2 TC",true);
	}
	
	@Test
	public void verifyUserID3()
	{
		Reporter.log("--Running Verify UserID3 TC",true);
	}
}
