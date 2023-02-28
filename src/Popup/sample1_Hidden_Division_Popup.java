package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_Hidden_Division_Popup 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
		
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
	}
}
