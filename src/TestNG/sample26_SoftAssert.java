package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample26_SoftAssert 
{
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		
		String A="India";
		String B="Australia";
		soft.assertEquals(B, A,"failed-both results are diff: ");
		
		String C="Ukraine";
		String D="Ukraine";
		soft.assertEquals(C,D,"Failed-both results are diff: ");
		
		soft.assertAll();
	}
	
}
