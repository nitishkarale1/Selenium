package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample10_keyword2_enabled 
{
	@Test(enabled = false)
	public void verifyLogo()
	{
		Reporter.log("--Running Verify Logo",true);
	}
	
	@Test
	public void verifyFont()
	{
		Reporter.log("--Running Verify Font",true);
	}
	
	@Test
	public void verifyImage()
	{
		Reporter.log("--Running Verify Image",true);
	}
	
}
