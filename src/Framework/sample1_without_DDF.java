package Framework;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_without_DDF
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("FE5680");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nitish@7620");
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("181094");
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		String ActUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String ExpUserID = "FE5680";
		
		if (ActUserID.equals(ExpUserID))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
	}
}
