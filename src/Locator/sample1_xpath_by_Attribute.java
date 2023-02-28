package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_xpath_by_Attribute 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dfdc");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vbbvb");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
