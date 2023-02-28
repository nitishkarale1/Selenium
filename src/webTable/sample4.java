package webTable;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.WhileClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.sport-histoire.fr/en/Geography/Countries_by_alphabetical_order.php");
		
		int rowSize=driver.findElements(By.xpath("//table[@class='tableau_gris_centrer']//tr")).size();
		System.out.println("row size: "+rowSize);
		
		int colSize=driver.findElements(By.xpath("//table[@class='tableau_gris_centrer']//tr[2]/td")).size();
		System.out.println("2nd row colsize: "+colSize);
		
		String text=driver.findElement(By.xpath("//table[@class='tableau_gris_centrer']//tr[110]/td[3]")).getText();
		System.out.println(text);
		
//		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@class='tableau_gris_centrer']//th"));
//		
//		for(WebElement header:allHeaders)
//		{
//			System.out.print(header.getText()+" ");
//		}
		
		
		List<WebElement> allData = driver.findElements(By.xpath("//table[@class='tableau_gris_centrer']//tr"));
	
		Iterator<WebElement> itr = allData.iterator();
		
		while(itr.hasNext())
		{
			System.out.println((itr.next().getText()));
		}
		
		
//		for(WebElement data:allData)
//		{
//			System.out.println(data.getText());
//		}
		driver.close();
	}
	
}
