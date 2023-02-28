package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_xpath_By_contains_Atrribute
{
	public static void main(String[] args) 
	{	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("nitish");
		
		driver.findElement(By.xpath("//input[contains(@class,'_6luy _9npi')]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//button[contains(@class,'_6lth _4jy6')]")).click();
	}
}
