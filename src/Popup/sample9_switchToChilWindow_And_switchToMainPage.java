package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_switchToChilWindow_And_switchToMainPage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//span[text()='Sign up with Google'])[1]")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		
		ArrayList<String> A=new ArrayList<String>(allIDs);
		
		String childwindowID = A.get(1);
		
		driver.switchTo().window(childwindowID);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		driver.switchTo().window(A.get(0));
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
	}
}
