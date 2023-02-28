package TestNg_Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample10_assertTrue 
{
	@Test
	public void TestCase1()
	{
		boolean act_result=true;
		Assert.assertTrue(act_result,"Failed: actual result is False");
	}
		
}
