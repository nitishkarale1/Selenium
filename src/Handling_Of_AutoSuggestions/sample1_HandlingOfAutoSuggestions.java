package Handling_Of_AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sample1_HandlingOfAutoSuggestions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Galaxy S22");
		
		List<WebElement> allEle = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		
		
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//div[contains(@class,'x6s0dn4 x1wzhzgj x78zum5')]//div"));
		
		for (WebElement S1:allEle)
		{
			String Act_Text = S1.getText();
			String Exp_Text = "galaxy s22 plus";
			
			if (Act_Text.equals(Exp_Text))
			{
				S1.click();
				break;
			}
		}		
		
	}
}
