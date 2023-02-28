package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_instagram
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("karalenitish979@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nitish@9418");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
		driver.findElement(By.xpath("//div[text()='Profile']")).click();
		String Name=driver.findElement(By.xpath("//span[text()='Nitish_Karale ]NK[']")).getText();
		System.out.println(Name);
		
//		driver.findElement(By.xpath("(//div[text()='More'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
}
