package Listbox;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
			
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement Year=driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select S=new Select(Year);
		S.selectByValue("2019");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select S1=new Select(day);
		S1.selectByValue("10");
		Thread.sleep(1000);
		driver.close();
	}
}
