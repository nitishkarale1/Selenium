package Customized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class sample9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act = new Actions(driver);
		act.click(month);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		act.click(day);
		act.sendKeys(Keys.END);
		for (int i=1; i<14; i++) 
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		act.click(year);
		for (int c=1; c<=28; c++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
	}
}
