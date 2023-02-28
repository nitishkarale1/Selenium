package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_switchToMainPage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.indeed.com/");
		
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		ArrayList<String> A=new ArrayList<String>(allIDs);
		String childwindowID = A.get(1);
		
		driver.switchTo().window(childwindowID);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("45484649652");
		
		driver.switchTo().window(A.get(0));
		
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		
		
	}
}
