package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample13_doubleClick 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(doubleclick).perform();
//		act.doubleClick().perform();
		
//		act.moveToElement(doubleclick).doubleClick().build().perform();
		
		act.doubleClick(doubleclick).perform();
		
	}
}
