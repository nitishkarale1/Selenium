package TestNG;

import org.testng.annotations.Test;

public class sample29_grouping1 
{
	@Test(groups = "wishlist")
	public void TC1() 
	{
		System.out.println("running TC1");
	}
	
	@Test(groups = "wishlist")
	public void TC2()
	{
		System.out.println("running TC2");
	}
	
	@Test(groups = "profile")
	public void TC3()
	{
		System.out.println("running TC3");
	}
	
	@Test(groups = "funds")
	public void TC4()
	{
		System.out.println("running TC4");	
	}
	
}
