package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample17_DragAndDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement srcEle = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destEle = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(srcEle).perform();
//		act.clickAndHold().perform();
//		act.moveToElement(destEle).perform();
//		act.release().perform();		
		
//		act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().build().perform();
		
		act.dragAndDrop(srcEle, destEle).perform();
		
		
	}
}
