package Handling_Of_Dynamic_Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_HandlingOfDynamicElements 
{
	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14pro max ");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String review = driver.findElement(By.xpath("((//div[@class='a-section'])[1]//span)[16]")).getText();
		
		System.out.println(review);
		
	}
}
