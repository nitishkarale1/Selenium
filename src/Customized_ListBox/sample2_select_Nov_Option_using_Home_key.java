package Customized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample2_select_Nov_Option_using_Home_key
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver",
//				"D:\\Software Testing\\selenium\\geckodriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		act.sendKeys(Keys.HOME).perform();
		
		for(int i=1; i<=10; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();

		
	}
}
