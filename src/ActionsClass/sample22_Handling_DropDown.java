package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample22_Handling_DropDown 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver",
		//		"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement loginEle=driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		act.moveToElement(loginEle).perform();
		WebElement Orders=driver.findElement(By.xpath("//div[text()='Orders']"));
		act.contextClick(Orders).perform();
		//act.click(Orders).perform();
	}
	
}
