package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_xpath_By_contains_using_text 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F");
		
		driver.findElement(By.xpath("//a[contains(text(),'username?')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//button[contains(@class,'puree-spinner')]")).click();
		
	}
}
