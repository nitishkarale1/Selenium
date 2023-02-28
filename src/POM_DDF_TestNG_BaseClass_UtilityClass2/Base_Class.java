package POM_DDF_TestNG_BaseClass_UtilityClass2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.beust.jcommander.Parameter;

public class Base_Class 
{
	WebDriver driver;
	
	public void initializeBrowser(String BrowserName)
	{
		if(BrowserName.equals("Chrome"))
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}
		
		else if(BrowserName.equals("Edge"))
		{
			EdgeOptions option1=new EdgeOptions();
			option1.addArguments("--disable_notifications");
			driver=new EdgeDriver(option1);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
}
