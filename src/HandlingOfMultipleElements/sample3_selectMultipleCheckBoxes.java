package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_selectMultipleCheckBoxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\Software Testing\\selenium\\html files\\MultipleCheckboxesss.html");
		
		List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement s1:AllCheckBoxes)
		{
			s1.click();
			Thread.sleep(1000);
		}
		
	}
}
