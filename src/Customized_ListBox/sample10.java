package Customized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample10 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(day).click().build().perform();
//		act.click(day).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
		
//		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
//		act.moveToElement(month).click().build().perform();
//		act.click(month).perform();
//		
//		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
//		act.moveToElement(year).click().perform();
//		act.click(year).perform();
		
	}
	
}
