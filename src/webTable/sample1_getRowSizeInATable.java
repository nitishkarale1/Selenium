package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_getRowSizeInATable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Software%20Testing/selenium/html%20files/sample6.WebTable.html");
		
//		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='abcd']//tr"));
//		int rowSize=allRows.size();
//		System.out.println(rowSize);
		
		int rowSize=driver.findElements(By.xpath("//table[@id='abcd']//tr")).size();
		System.out.println(rowSize);
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
