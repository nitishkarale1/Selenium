package ScrollUpDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample10 
{
	public static void main(String [] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver",
//				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000)");
			
			
		
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3500)");
//		Thread.sleep(2000);
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-2000)");

		Thread.sleep(3000);
		driver.close();
	}
	
}
