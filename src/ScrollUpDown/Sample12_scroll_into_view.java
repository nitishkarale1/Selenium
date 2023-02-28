package ScrollUpDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample12_scroll_into_view 
{
	public static void main(String [] args) throws InterruptedException
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");
		
		WebElement JIRA=driver.findElement(By.xpath("//h4[text()='JIRA']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",JIRA);
		
		JIRA.click();
		//driver.close();
		
	}
	
}
