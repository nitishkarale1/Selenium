package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{
	public static void main(String[] args)
	{
		
	
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1657185288&rver=7.3.6960.0&wp=MBI_SSL&wreply=https%3a%2f%2fwww.microsoft.com%2fen-in%2fwindows%2f&id=74335");
	
	driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("nitishkarale1@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();

   }
}
