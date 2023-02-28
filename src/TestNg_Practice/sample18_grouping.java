package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample18_grouping
{
	@Test(groups="Name")
	public void FirstName()
	{
		Reporter.log("Pratik",true);
	}
	
	@Test(groups="SurName")
	public void LastName()
	{
		Reporter.log("Dongare",true);
	}
	
	@Test(groups="City")
	public void city()
	{
		Reporter.log("Amravati",true);
	}
	
}
