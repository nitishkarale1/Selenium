package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_WebElement_methods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		UN.sendKeys("nitish");
		
		Thread.sleep(2000);
	
		UN.clear();
		
		WebElement UN1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String text = UN1.getText();
		System.out.println(text);
		System.out.println("-------------------------------------");
		
		UN1.click();
		
		driver.navigate().back();
		
		boolean result = driver.findElement(By.xpath("//a[text()='Create New Account']")).isEnabled();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is not Enabled");
		}
		
		System.out.println("-------------------------------------");
		
		boolean result1 = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(result1);
		
		if (result1==true) 
		{
			System.out.println("Logo Displayed");
		}
		else
		{
			System.out.println("Logo is not Displayed");
		}
		System.out.println("-------------------------------------");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		boolean femaleRB = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		if (femaleRB==true)
		{
			System.out.println(" femaleRB is Enabled");
		}
		else
		{
			System.out.println(" femaleRB is not Enabled");
		}
		System.out.println("-------------------------------------");
		
		
	}
}
