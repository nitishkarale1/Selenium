package TestNg_Practice;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample4_keyword2_enabled 
{
	@Test
	public void TestCase1() 
	{
		Reporter.log("running Test Case1",true);
	}
	
	@Test(enabled=false)
	public void TestCase2() 
	{
		Reporter.log("running Test Case2",true);
	}
	
	@Test
	public void TestCase3() 
	{
		Reporter.log("running Test Case3",true);
	}
	
	@Test(enabled=false)
	public void TestCase4() 
	{
		Reporter.log("running Test Case4",true);
	}
	
}
