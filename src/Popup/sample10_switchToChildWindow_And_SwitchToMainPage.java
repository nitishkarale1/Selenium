package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample10_switchToChildWindow_And_SwitchToMainPage
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://secure.indeed.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		
		Set<String> AllIDs = driver.getWindowHandles();
		ArrayList<String> A=new ArrayList<String>(AllIDs);
		String childwindowID = A.get(1);
		
		driver.switchTo().window(childwindowID);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("455825412");
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(A.get(0));
		
		driver.findElement(By.xpath("//input[@name='__email']")).sendKeys("abc@abc.coom");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
    }
}
