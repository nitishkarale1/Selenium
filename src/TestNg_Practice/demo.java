package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo
{
	@Test
	public void TC()
	{
		String actResult="Hi";
		String expResult="Hello";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actResult, expResult,"Failed: both results are diff");
		
		boolean actResult1=true;
		soft.assertTrue(actResult1,"Failed: both results are diff");
		
		soft.assertAll();  // mandatory method (without assertAll() tesng always pass the TC even if one of the verification is failed so it's mandatory to use assertAll method)
	}                      //                  (with assertAll() if any verification fails then testng will show TC as failed)
	
}
