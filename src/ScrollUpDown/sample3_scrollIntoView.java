package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_scrollIntoView
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",facebook);
		
		WebElement BrandDirectory = driver.findElement(By.xpath("//a[text()='Brand Directory']"));
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",BrandDirectory);
	}
}
