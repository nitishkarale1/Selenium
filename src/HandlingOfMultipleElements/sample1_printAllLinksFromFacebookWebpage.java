package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_printAllLinksFromFacebookWebpage 
{
	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		
		int Size = AllLinks.size();
		System.out.println("Link Size: "+Size);
		
		for (WebElement link:AllLinks)
		{
			System.out.println(link.getText());
		}
		
	}
}
