package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5_isEnabled
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(result);
		
		if (result==true) 
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is not Enabled");
		}
	}
}
