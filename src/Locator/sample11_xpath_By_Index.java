package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11_xpath_By_Index 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
      
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		
		driver.findElement(By.xpath("(//input[contains(@class,'_58mg')])[2]")).sendKeys("xyz");
		
		driver.findElement(By.xpath("(//input[contains(@class,'_58mg')])[3]")).sendKeys("99999999");
		
	}
}
