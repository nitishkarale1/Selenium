package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class sample2_Scroll_Up_Down_left_Right 
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
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2500)");
		
		//scroll up--> 2nd parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-2000)");
		
		//scroll right--> 1st parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(2000,0)");
		
		//scroll left--> 1st parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(-1500,0)");
		
	}
}
