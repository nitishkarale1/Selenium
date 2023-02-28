package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample18_HandlingOfDropdown 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		Options s1 = driver.manage();
//		Window s2 = s1.window();
//		s2.maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		act.moveToElement(login).perform();
		WebElement Giftcards = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		act.click(Giftcards).perform();

	}
}
