package Customized_ListBox;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample11 
{
	public static void main(String[] args) throws InterruptedException 
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
		act.click(day).perform();
		
		act.sendKeys(Keys.END).perform();
		
		for(int i=1; i<=13; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(40);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		act.click(month).perform();
		
		act.sendKeys(Keys.END).perform();
		
		for(int i=1; i<=8; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(40);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		act.click(year).perform();
		
		for(int i=1; i<=28; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(40);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		act.click(gender).perform();
		
		System.out.println("~~ Print Title ~~");
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		
		System.out.println("---------------------------------------------");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("~~ Print Links Presnt in a WebPage ~~");
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
		System.out.println("------------------------------");
		
		System.out.println("~~ All Link Size ~~");
		System.out.println(allLinks.size());
		
		System.out.println("------------------------------");
		
		driver.close();
	}
			
}
