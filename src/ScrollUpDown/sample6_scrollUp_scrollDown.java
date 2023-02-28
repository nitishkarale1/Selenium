package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_scrollUp_scrollDown
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2500)");
//		Thread.sleep(2000);
//	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-2000)");
//	    Thread.sleep(2000);
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",twitter);
	}
}
