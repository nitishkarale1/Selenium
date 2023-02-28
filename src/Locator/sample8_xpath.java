package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8_xpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'-ekkqgF')]")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//strong[contains(text(),'Pune')]")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'-ebFjAB')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'-ekkqgF')]")).sendKeys("Jurassic World: Dominion");
		
		driver.findElement(By.xpath("//span[contains(@class,'-ivVeuv')]"));
		
		driver.findElement(By.xpath("//span[@color='#666666']")).click();
	}
}
