package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample18_AssetClass1_assertEquals 
{
	@Test
	public void TC1()
	{
		String actResult="Hi";
		String expResult="Hi";
		
		Assert.assertEquals(actResult, expResult,"failed-both results are different");
	}
	
}
