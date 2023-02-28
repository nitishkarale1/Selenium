package Handling_Of_Dynamic_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8_getRatingFromFlipkartApp
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String text = driver.findElement(By.xpath("(//div[@class='_2kHMtA']//span)[7]")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
