package Listbox;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample12_getallOptionsfromListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select S1=new Select(day);
		
		List<WebElement> getalloptions=S1.getOptions();
		
		for(WebElement A1:getalloptions)
		{
			System.out.println(A1.getText());
		}
		int size=getalloptions.size();
		
		
		
		System.out.println("size: "+S1.getOptions().size());
		
		//System.out.println("size: "+size);
		
		
		System.out.println("---get all options using ListIterator---");
		
		ListIterator<WebElement> itr = getalloptions.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
			
//			String text = itr.next().getText();
//			System.out.println(text);
			
		}
		
		Thread.sleep(1000);
		driver.close();
	}
}
