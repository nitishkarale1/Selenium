package Customized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample8_select_my_BirthDate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Actions act=new Actions(driver);
		act.click(day).perform();
		act.sendKeys(Keys.HOME).perform();
		
		for(int a=1; a<=17; a++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		act.click(month).perform();
		act.sendKeys(Keys.END).perform();
		
		for (int b = 1; b<=2; b++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		act.click(year).perform();
		
		for (int c=1; c<=28; c++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(300);
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
	}
}
