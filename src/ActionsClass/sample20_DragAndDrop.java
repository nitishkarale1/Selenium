package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample20_DragAndDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement srcEle=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement destEle=driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().build().perform();
		
		act.dragAndDrop(srcEle, destEle).build().perform();
		
	}
	
}
