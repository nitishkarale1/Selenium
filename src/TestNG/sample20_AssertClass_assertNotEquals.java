package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample20_AssertClass_assertNotEquals 
{
	@Test
	public void Tc1()
	{
		String actResult="Good Morning";
		String expResult="Good Morning";
		Assert.assertNotEquals(actResult, expResult,"Failed-both results are same: ");
	}
	
}
