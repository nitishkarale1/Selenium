package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample25_AssertClass1_assertFalse 
{
	@Test
	public void TC1()
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"Failed-actual result is true: ");
	}
}
