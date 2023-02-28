package Sample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo
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
		
		String price = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[4]//span)[8]")).getText();
		
		System.out.println(price);
		
	}
}
