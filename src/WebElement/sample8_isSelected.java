package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample8_isSelected 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement femaleRB = driver.findElement(By.xpath("//input[@type='radio']"));
		
		boolean result1 = femaleRB.isSelected();
		
		if (result1==true)
		{
			System.out.println("Radio btn is Selected");
		}
		else
		{
			System.out.println("Radio btn is not Selected");
			femaleRB.click();
			
			boolean result2 = femaleRB.isSelected();  
			if (result2==true)
			{
				System.out.println("Radio btn is Selected");
			}
			else
			{
				System.out.println("Radio btnElement is not Selected");
			}
		}
	}
}
