package ScrollUpDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_scrollUp_Down 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		
		
		
		
	}
	
}
