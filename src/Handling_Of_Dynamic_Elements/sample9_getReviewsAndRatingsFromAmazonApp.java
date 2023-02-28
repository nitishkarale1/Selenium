package Handling_Of_Dynamic_Elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_getReviewsAndRatingsFromAmazonApp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[contains(@id,'textbox')]")).sendKeys("oneplus 10 pro");
		driver.findElement(By.xpath("//input[contains(@id,'submit-button')]")).click();
		driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini a-spacing-none')])[1]")).click();
		String text=driver.findElement(By.xpath("(//span[@id='acrCustomerReviewText'])[1]")).getText();
		
		System.out.println(text);
		
	}
	
}
