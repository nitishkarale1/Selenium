package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample27_softAssert
{
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		
		boolean actResult=true;
		soft.assertTrue(actResult,"Failed-actual result is false");
		
		String A="good morning";
		String B="good morning";
		soft.assertEquals(A, B,"Failed-both results are diff: ");

		boolean actResult1=true;
		soft.assertFalse(actResult1,"Failed-actual result is true: ");
		
		soft.assertAll();
	}

}
