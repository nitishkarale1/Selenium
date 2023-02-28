package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample23_AssertClass1_assertTrue 
{
	@Test
	public void TC1()
	{
		boolean A=false;
		Assert.assertTrue(A,"Failed actual result is false: ");
	}
}
