package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//driver.switchTo().frame("iframeresult");
		//driver.switchTo().frame("iframeresult");
		driver.switchTo().frame(1);
		//driver.switchTo().frame("(//iframe[@frameborder='0'])[2]");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
		
		driver.switchTo().parentFrame();
		
		//swc.defaultContent();
		
		driver.findElement(By.xpath("//a[@onclick='openMenu()']")).click();
	}
}