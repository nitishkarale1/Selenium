package Handling_Of_Dynamic_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
	
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		//enter mobile
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10 pro");
		
		
		//click on search ICON
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		//get reviews
		String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
		System.out.println(review);
	}
}
