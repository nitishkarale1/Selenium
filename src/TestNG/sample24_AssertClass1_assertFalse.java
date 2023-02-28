package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample24_AssertClass1_assertFalse
{
	@Test
	public void TC1()
	{
		boolean actualResult=false;
		Assert.assertFalse(actualResult,"Failed actual result is true: ");
	}
}
