package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_switchToChildWindow
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		ArrayList<String> A=new ArrayList<String>(allIDs);
		String childwindowID = A.get(1);
		driver.switchTo().window(childwindowID);
		
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String s1 = text.getText();
		System.out.println(s1);
	}
}
