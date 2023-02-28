package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11_switchTomainPageFromChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> Al=new ArrayList<String>(allIds);
		String childWindowID = Al.get(1);	
		driver.switchTo().window(childWindowID);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().window(Al.get(0));
		
		driver.findElement(By.xpath("//input[@id='ifl-InputFormField-3']")).sendKeys("abcd");
		
	}
}
