package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample_15_xpath
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(@class,'cb-search')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@value,'suggest.title')]")).sendKeys("virat kohli");
		
		driver.findElement(By.xpath("//a[text()='SEARCH']")).click();
	}
}
