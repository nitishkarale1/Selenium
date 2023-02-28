package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
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
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("smartwatch");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
