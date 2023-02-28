package TestNg_Practice;

import org.testng.Assert;

public class sample8_assertEquals 
{
	public void TestCase1()
	{
		String act_UserID="nitih_k";
		String exp_UserID="nitish_k";
		
		Assert.assertEquals(act_UserID, exp_UserID,"Failed: both results are different");
	}
	
}
