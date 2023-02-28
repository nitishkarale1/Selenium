package Popup;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample14_switchToChildWindow 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// scroll down
		((JavascriptExecutor) driver).executeScript("window,scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Meta']")).click();
		
		//switch to child window
		Set<String> allIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIds);
		String childWindowId = al.get(1);
		driver.switchTo().window(childWindowId);
		Thread.sleep(5000);
		
		// get text
		String text=driver.findElement(By.xpath("//p[text()='Bringing people closer every day']")).getText();
		System.out.println("child window text: "+text);
		Thread.sleep(1000);
		
		// scroll down
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		
		// Screenshot
		String Rs = RandomString.make(2);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		File dest=new File("F:\\Software Testing\\selenium\\screenshots\\Nk"+Rs+".jpg");
		FileHandler.copy(src, dest);
		
		// scroll up
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)");
		
		// drop down handling
		WebElement BWU = driver.findElement(By.xpath("//a[text()='Build with us']"));
		Actions act=new Actions(driver);
		act.moveToElement(BWU).perform();
		driver.findElement(By.xpath("//a[text()='Media']")).click();
		Thread.sleep(2000);

		// switch to main page from child window
		String mainPageId = al.get(0);
		driver.switchTo().window(mainPageId);
		
		// handling of multiple elements
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("all links size: "+allLinks.size());
		
		System.out.println("----Using for each loop----");
		
		for(WebElement l1:allLinks)
		{
			System.out.println(l1.getText());
		}
		
		System.out.println("----Using for loop----");
		
		for(int i=0; i<=allLinks.size()-1; i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		System.out.println("----Using Itrator----");
	
		Iterator<WebElement> itr = allLinks.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

		Thread.sleep(2000);
		driver.quit();
	}
	
}
