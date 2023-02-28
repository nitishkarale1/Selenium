package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_Alert_Popup
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("111");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		
		System.out.println(text);
		
		//alt.dismiss();
		
		alt.accept();
		
		
		
		alt.accept();
		
	}
	
}
