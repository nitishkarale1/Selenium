package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample9 
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://cars.tatamotors.com/suv/safari/kaziranga");
		
		sample9.capture_ScreenShot();
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void capture_ScreenShot() throws IOException
	{
		String rs = RandomString.make(2);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Software Testing\\selenium\\screenshots\\axt"+rs+".png");
		FileHandler.copy(src, dest);
	}
	
	
}
