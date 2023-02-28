package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_selectMultipleCheckBoxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\Software Testing\\selenium\\html files\\MultipleCheckboxesss.html");
		
		List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement Checkbox:AllCheckboxes)
		{
			Checkbox.click();
			Thread.sleep(100);
		}
		for(int i=AllCheckboxes.size()-1; i>=0; i--)
		{
			AllCheckboxes.get(i).click();
			Thread.sleep(100);
		}
		
	}
	
}
