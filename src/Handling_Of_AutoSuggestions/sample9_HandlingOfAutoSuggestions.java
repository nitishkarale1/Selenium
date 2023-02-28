package Handling_Of_AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9_HandlingOfAutoSuggestions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("tvs apache rr 310");
		
		 List<WebElement> AllEle = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		for(WebElement Ele:AllEle)
		{
			String actText=Ele.getText();
			String expText="tvs apache rr 310 price";
			if(actText.equals(expText))
			{
				Ele.click();
				break;
			}
			
		}
		
		
		
		
		
		
	}
	
}
