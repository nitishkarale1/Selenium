package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample10_click 
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
//		act.click().perform();
//		act.moveToElement(cartEle).click().build().perform();
		
		act.click(cartEle).perform();
		
		
		
	}
}
