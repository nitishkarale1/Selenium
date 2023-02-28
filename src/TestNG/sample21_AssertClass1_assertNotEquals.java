package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample21_AssertClass1_assertNotEquals 
{
	@Test
	public void TC1()
	{
		String A="Hello";
		String B="Hello";
		Assert.assertNotEquals(A, B,"Failed-both results are same: ");
	}
}
