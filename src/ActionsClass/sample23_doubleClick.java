package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample23_doubleClick 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleClickELe = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(doubleClickELe).doubleClick().build().perform();
		
		//act.doubleClick(doubleClickELe).build().perform();
	}
	
}
