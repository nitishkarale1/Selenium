package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample12_Hidden_Division_Popup
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz123");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		String ErrorMsg=driver.findElement(By.xpath("//span[contains(text(),'Please enter')]")).getText();
		System.out.println("ErrorMsg: "+ErrorMsg);
		Thread.sleep(2000);
		driver.close();
	}
	
}
