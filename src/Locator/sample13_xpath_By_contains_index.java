package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample13_xpath_By_contains_index 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/login");
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	}
	
}
