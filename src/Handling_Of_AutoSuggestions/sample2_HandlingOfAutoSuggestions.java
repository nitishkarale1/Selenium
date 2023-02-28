package Handling_Of_AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_HandlingOfAutoSuggestions 
{
	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		
		List<WebElement> allEle = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for (WebElement A1:allEle)
		{
			String Act_Text = A1.getText();
			String Exp_Text = "iphone 13 pro";
			
			if (Act_Text.equals(Exp_Text))
			{
				A1.click();
				break;
			}
			
		}
		
		
		
		
		
		
	}
}
