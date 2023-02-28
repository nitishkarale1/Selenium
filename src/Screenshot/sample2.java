package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class sample2
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		String name = RandomString.make(3);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Software Testing\\selenium\\screenshots\\abc"+name+".png");
		
		FileHandler.copy(src, dest);
		
	}
}
