package TestNg_Practice;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3_keyword1_invocationCount 
{
	@Test(invocationCount=2)
	public void TestCase1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(invocationCount=4)
	public void TestCase2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test
	public void TestCase3()
	{
		Reporter.log("running TC3",true);
	}
	
}
