package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7038977298");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nitish7620");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("IAIR s19 mobile");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		//driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		
	}
}
