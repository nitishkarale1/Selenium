package Handling_Of_AutoSuggestions;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample10 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("karalenitish979@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nitish@9418");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.findElement(By.xpath("(//div[text()='Search'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("virat kohli");
	
		String t1=driver.findElement(By.xpath("(//div[@role='none'])[1]")).getText();
		System.out.println(t1);
		
//		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[contains(@class,'x9f619 x78zum5 xdt5ytf x6ikm8r')]/div"));
//		
//		Iterator<WebElement> itr = allSuggestions.iterator();
//		while(itr.hasNext())
//		{
//			WebElement a1 = itr.next();
//			String text = a1.getText();
//			System.out.println(text);
//		}
		Thread.sleep(2000);
		driver.close();
	}
	
}
