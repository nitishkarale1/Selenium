package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample8_contextClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement becomeSellerEle = driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(becomeSellerEle).perform();
//		
//		act.contextClick().perform();
		
//		act.moveToElement(becomeSellerEle).contextClick().build().perform();
		
		act.contextClick(becomeSellerEle).perform();
		
	}
}
