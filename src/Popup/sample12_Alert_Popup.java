package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample12_Alert_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert Alt = driver.switchTo().alert();
		
		System.out.println(Alt.getText());
		Thread.sleep(1000);
		Alt.accept();
		Thread.sleep(1000);
		Alt.accept();
		
		driver.close();
	}
}
