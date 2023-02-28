package Handling_Of_AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8_HandlingOfAutoSuggestions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
				
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("OnePlus");
		
		List<WebElement> allEle = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li"));
		
		for(WebElement Ele:allEle)
		{
			String actText = Ele.getText();
			String expText="oneplus 10 pro";
			
			if(actText.equals(expText))
			{
				Ele.click();
				break;
			}	
			
		}
		
	}
	
}
