package TestNg_Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample23_MultiBrowser_Testing
{
	WebDriver driver=null;
	@Parameters("BrowserName")
	@Test(priority=1)
	public void openBrowser(String BrowserName)
	{
		if(BrowserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		
	}
	
	@Test(priority=2)
	public void openFacebookApp()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=3)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
