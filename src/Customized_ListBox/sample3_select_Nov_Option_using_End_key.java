package Customized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class sample3_select_Nov_Option_using_End_key
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("  ", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		act.sendKeys(Keys.END).perform();
		
		for(int i=1; i<=4; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		//driver.close();
		
	}
}
