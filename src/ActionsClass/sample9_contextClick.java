package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample9_contextClick 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement cartEle = driver.findElement(By.xpath("//span[text()='Cart']"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(cartEle).perform();
//		
//		act.contextClick().perform();
		
		act.moveToElement(cartEle).contextClick().build().perform();
		
		act.contextClick(cartEle).perform();	
		
	}
}
