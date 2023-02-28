package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample16_grouping
{
	@Test(groups="Name")
	public void FirstName()
	{
		Reporter.log("Nitish",true);
	}
	
	@Test(groups="SurName")
	public void LastName()
	{
		Reporter.log("Karale",true);
	}
	
	@Test(groups="City")
	public void city()
	{
		Reporter.log("Aurangabad",true);
	}
	
}
