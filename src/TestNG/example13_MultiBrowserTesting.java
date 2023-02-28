package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


	public class example13_MultiBrowserTesting
	{
		@Parameters("browserName")
		@Test
		public void TC(String browserName) throws InterruptedException 
		{
			WebDriver driver=null;
			
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
			else if (browserName.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", 
						"D:\\Software Testing\\selenium\\edge driver\\msedgedriver.exe");
				driver=new EdgeDriver();
			}	
			
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
					
			Thread.sleep(3000);
			
			driver.quit();
			
		}
		
	}
		
		
			
			
		
			
	

	
	

