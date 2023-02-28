package Screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class sample7 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://cars.tatamotors.com/images/kaziranga/nexon-kaziranga-desktop-banner-1.png");
		
		String Rs = RandomString.make(3);
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Software Testing\\selenium\\screenshots\\vct"+Rs+".png");
		
		FileHandler.copy(src, dest);
		
		try 
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	
		
		driver.close();
	}
	
}
