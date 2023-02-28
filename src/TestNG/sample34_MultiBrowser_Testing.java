package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample34_MultiBrowser_Testing 
{
	WebDriver driver=null;
	
	@Parameters("browserName")
	@Test
	public void TC(String browserName) throws InterruptedException
	{
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", 
					"D:\\Software Testing\\selenium\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("opera"))
		{
			
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		driver.quit();
	}		
		

}
