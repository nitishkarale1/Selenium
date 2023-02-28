package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample10_getallselectedoptionfromMultiselectedListbox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Software%20Testing/selenium/html%20files/multipleoptionslistbox.html");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select S1=new Select(country);
		
		S1.selectByIndex(1);
		S1.selectByIndex(2);
		S1.selectByIndex(3);

		List<WebElement> allselectedoptions=S1.getAllSelectedOptions();
		
		for( WebElement B:allselectedoptions)
		{
			System.out.println(B.getText());
		}
		
		System.out.println(allselectedoptions.size());
		
		int size=allselectedoptions.size();
		System.out.println(size);
		
		
	}
}
