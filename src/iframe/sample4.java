package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame(1);
//		driver.switchTo().frame("iframeResult");
//		driver.switchTo().frame("iframeResult");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
		
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
	}
}