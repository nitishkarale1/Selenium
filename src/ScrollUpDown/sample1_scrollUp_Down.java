package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_scrollUp_Down
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//scroll down--> 2nd parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);

		//scroll up--> 2nd parameter -value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1500)");
		
		//scroll right--> 1st parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(3000,0)");
		
		//scroll left--> 1st parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(-2000,0)");
			
	}
}
