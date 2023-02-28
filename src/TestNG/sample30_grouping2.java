package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample30_grouping2 
{
	@Test(groups = "wishlist")
	public void TC5() 
	{
		System.out.println("running TC5");
	}
	
	@Test(groups = "profile")
	public void TC6()
	{
//		String actResult="hi";
//		String expResult="hello";
//		SoftAssert soft=new SoftAssert();
//		soft.assertEquals(actResult, expResult,"Failed: both results are different");
//		soft.assertAll();
		System.out.println("running TC6");
	}
	
	@Test(groups = "profile")
	public void TC7()
	{
		System.out.println("running TC7");
	}
	
	@Test(groups = "funds")
	public void TC8()
	{
		System.out.println("running TC8");		
	}
	
}
