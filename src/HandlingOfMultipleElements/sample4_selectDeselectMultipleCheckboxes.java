package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_selectDeselectMultipleCheckboxes
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Software%20Testing/selenium/html%20files/multipleCheckBoxes.html");
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement S1:allCheckboxes)
		{
			S1.click();
			Thread.sleep(1000);
		}
		
		for (int i=allCheckboxes.size()-1; i>=0; i--)
		{
			allCheckboxes.get(i).click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		driver.close();
		
	}
}
