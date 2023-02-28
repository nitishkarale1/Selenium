package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample22_AssertClass1_assertTrue 
{
	@Test
	public void TC1()
	{
		boolean actresult=false;
		Assert.assertTrue(actresult,"Failed-Actual result is false: ");
	}
}
