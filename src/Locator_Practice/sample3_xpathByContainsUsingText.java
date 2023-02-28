package Locator_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_xpathByContainsUsingText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// xpath By contains using text
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
	
}
