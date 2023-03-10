package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_CaptureSSofOnlyFailedTCes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class 
{
	WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Utility_Class.getPropertyFileData("URL"));
	}
	
}
