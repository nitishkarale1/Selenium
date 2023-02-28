package Locator_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_xpathByContainsUsingAttribute 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// xpath By contains using Attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
}
