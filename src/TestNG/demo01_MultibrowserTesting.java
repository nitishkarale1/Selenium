package TestNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo01_MultibrowserTesting 
{
	WebDriver driver=null;
	@Parameters("browserName")
	@Test
	public void TC(String browserName) throws InterruptedException
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
//		else if(browserName.equals("Opera"))
//		{
//			System.setProperty("webdriver.opera.driver","");
//			driver = new OperaDriver();
//		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"D:\\Software Testing\\selenium\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
