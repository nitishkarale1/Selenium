package TestNg_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample17_grouping
{
	@Test(groups="Name")
	public void FirstName()
	{
		Reporter.log("Anuja",true);
	}
	
	@Test(groups="SurName")
	public void LastName()
	{
		Reporter.log("Dixit",true);
	}
	
	@Test(groups="City")
	public void city()
	{
		Reporter.log("Panaji",true);
	}
	
}
