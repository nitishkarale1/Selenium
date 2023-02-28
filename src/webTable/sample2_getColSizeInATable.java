package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_getColSizeInATable 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Software%20Testing/selenium/html%20files/sample6.WebTable.html");
		
		List<WebElement> allColSize = driver.findElements(By.xpath("(//table[@id='abcd']//tr)[2]/td"));
		int colSize=allColSize.size();
		System.out.println(colSize);
		
		int colSize1=driver.findElements(By.xpath("//table[@id='abcd']//tr[1]/th")).size();
		System.out.println(colSize1);
		
		String text=driver.findElement(By.xpath("//table[@id='abcd']//tr[2]//td[2]")).getText();
		System.out.println(text);
	}
	
}
