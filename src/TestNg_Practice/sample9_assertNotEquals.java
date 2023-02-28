package TestNg_Practice;

import org.testng.Assert;

public class sample9_assertNotEquals
{
	public void TestCase1()
	{
		String act_userID="abcd1";
		String exp_UserID="xyz2";
		
		Assert.assertNotEquals(act_userID, exp_UserID,"Failed: both results are same");
	}
	
}
