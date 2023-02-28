package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_switchToChildWindow
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.indeed.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Facebook')]")).click();
		
		//switch focus to childwindow
		Set<String> allIDs = driver.getWindowHandles();
		
		ArrayList<String> aL=new ArrayList<String>(allIDs);
		
		String childwindowID = aL.get(1);
		
		driver.switchTo().window(childwindowID);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7217217213");
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
}
