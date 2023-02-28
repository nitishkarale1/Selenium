package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5_switchToChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.indeed.com/");
		
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		
		//get childwindowID
		Set<String> allIDs = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIDs);
		
		String childwindowID = al.get(1);
		
		//switch to child window
		driver.switchTo().window(childwindowID);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("56855865875");
		
		Thread.sleep(2000);
	}
}
