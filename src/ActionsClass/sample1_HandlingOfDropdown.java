package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1_HandlingOfDropdown
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airindia.in/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement travelInfo = driver.findElement(By.xpath("(//a[text()='Travel Info'])[2]"));
		act.moveToElement(travelInfo).perform();
		WebElement AirportInfo = driver.findElement(By.xpath("(//a[text()='Airport Information'])[2]"));
		act.click(AirportInfo).perform();
		
		String text=driver.findElement(By.xpath("//h2[@class='title']")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.close();
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		
//		WebElement loginEle = driver.findElement(By.xpath("//a[text()='Login']"));
//		
//		Thread.sleep(2000);
//		
//		Actions act=new Actions(driver);
//		
//		act.moveToElement(loginEle).perform();
//		
//		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
//		
//		Thread.sleep(2000);
//		driver.close();
		
	}
}
