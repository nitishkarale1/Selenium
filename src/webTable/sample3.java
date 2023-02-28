package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.page.model.LifecycleEvent;

import com.neilalexander.jnacl.crypto.verify_16;

public class sample3
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		
		int rowSize=driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();		
		System.out.println(rowSize);
	
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		
		for(WebElement header:allHeaders)
		{
			System.out.print(header.getText()+"  ");
		}
		System.out.println();
		
//		WebElement values = driver.findElement(By.xpath("//table[@id='dataTable']//tr[4]/td[4]"));
//		System.out.println(values.getText());
//		
		Thread.sleep(2000);
		driver.close();
	}
	
}
