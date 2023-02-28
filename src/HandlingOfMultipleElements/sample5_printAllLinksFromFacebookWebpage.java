package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5_printAllLinksFromFacebookWebpage
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		 List<WebElement> AllLinksElement = driver.findElements(By.xpath("//a"));
		 for(WebElement Link:AllLinksElement)
		 {
			 System.out.println(Link.getText());
		 }
		
	}
}
