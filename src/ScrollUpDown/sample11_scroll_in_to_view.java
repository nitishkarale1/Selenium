package ScrollUpDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11_scroll_in_to_view 
{
	public static void main(String [] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/");
		
		WebElement morePhotos = driver.findElement(By.xpath("//i[text()='More Photos..']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",morePhotos);
		
		morePhotos.click();
		
		Thread.sleep(3000);
		driver.close();
	}
	
}
