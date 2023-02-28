package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample35_MultiBrowser_Testing1 
{
	WebDriver driver=null;
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"D:\\Software Testing\\selenium\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.quit();
	}
		
}
