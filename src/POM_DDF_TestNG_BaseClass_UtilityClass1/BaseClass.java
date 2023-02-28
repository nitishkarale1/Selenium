package POM_DDF_TestNG_BaseClass_UtilityClass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import graphql.PublicApi;

public class BaseClass 
{
	WebDriver driver=null;
	
	public void initializeBrowser(String browserName)
	{
		
		if(browserName.equals("Chrome")) 
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(option);
			
		}
		else if(browserName.equals("Edge"))
		{
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.edge.driver",
					"D:\\Software Testing\\selenium\\edge driver\\msedgedriver.exe");
			driver=new EdgeDriver(option);
	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver(option);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://kite.zerodha.com/");
	}
	
}
