package Screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample10 
{
	static WebDriver driver;
	public static void main(String [] args) throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");
		
		sample10 s10=new sample10();
		s10.captureSS();
	}
	
	public void captureSS() throws IOException
	{
		String Rs = RandomString.make(2);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing\\selenium\\screenshots\\kkl"+Rs+".png");
		FileHandler.copy(src,dest);
	}
	
}
