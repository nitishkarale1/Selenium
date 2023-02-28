package Customized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//step1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2
		Actions act=new Actions(driver);
		
		//step3
		act.click(month).perform();
		
		//step4 a
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		
		//step4 b
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		//step4 c
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(4000);
		driver.close();
		
	}
}
