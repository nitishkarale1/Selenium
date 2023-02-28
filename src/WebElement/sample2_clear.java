package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
		Thread.sleep(2000);
		
		UN.sendKeys("abc");
		Thread.sleep(2000);

		UN.clear();
		Thread.sleep(2000);
		
		UN.sendKeys("xyz");
	}
}
