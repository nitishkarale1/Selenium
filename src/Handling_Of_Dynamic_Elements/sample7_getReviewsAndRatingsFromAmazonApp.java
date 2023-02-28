package Handling_Of_Dynamic_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_getReviewsAndRatingsFromAmazonApp
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi note 9 pro glacier white");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String price = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[9]//span)[16]")).getText();
		
		System.out.println("Price: "+price);
		
		String reviews = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[9]//span)[14]")).getText();
		 
		System.out.println("Reviews: "+reviews);
	}
}
