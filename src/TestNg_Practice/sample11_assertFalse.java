package TestNg_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample11_assertFalse 
{
	@Test
	public void TestCase1()
	{
		boolean act_Result=false;
		Assert.assertFalse(act_Result,"Failed: actual result is True");
	}
	
}
