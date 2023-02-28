package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkart 
{
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8855993881");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8855993881");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollby('0,20')");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]")).click();
			
	}
	
}
