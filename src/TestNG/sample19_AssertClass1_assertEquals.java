package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample19_AssertClass1_assertEquals 
{
	@Test
	public void TC1()
	{
		String actualResult="Good Morning";
		String expResult="Good Evening";
		Assert.assertEquals(actualResult, expResult,"Failed-both results are diff: ");
	}
	
}
