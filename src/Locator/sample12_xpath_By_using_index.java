package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample12_xpath_By_using_index 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'VJZDxU')])[1]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("(//input[contains(@class,'_2IX_2-')])[2]")).sendKeys("xyz");
		
		driver.findElement(By.xpath("(//button[contains(@class,'_2HKlqd')])[1]")).click();
	}
	
}
