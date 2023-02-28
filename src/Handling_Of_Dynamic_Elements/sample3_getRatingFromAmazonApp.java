package Handling_Of_Dynamic_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_getRatingFromAmazonApp
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 10 pro");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String review = driver.findElement(By.xpath("")).getText();
		//((//div[contains(@class,'s-card-container s-overflow-hidden aok-relative')])[2]//span)[6]
		System.out.println(review);
		
	}
}
