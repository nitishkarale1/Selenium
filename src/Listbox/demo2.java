package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
			Select S=new Select(day);
			S.selectByValue("26");
		
		
	}
}
