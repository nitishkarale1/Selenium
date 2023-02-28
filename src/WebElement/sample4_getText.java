package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_getText 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement result = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String text1=result.getText();
		System.out.println(text1);
		
		WebElement result1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		String text2=result1.getText();
		System.out.println(text2);
		
		
	}
}
