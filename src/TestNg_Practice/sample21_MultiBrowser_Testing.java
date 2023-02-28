package TestNg_Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample21_MultiBrowser_Testing 
{
	WebDriver driver = null;
	
	@Parameters("BrowserName")
	@Test
	public void TestCase(String BrowserName) throws InterruptedException
	{
		if(BrowserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if (BrowserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if (BrowserName.equals("Edge")) 
		{
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
}
