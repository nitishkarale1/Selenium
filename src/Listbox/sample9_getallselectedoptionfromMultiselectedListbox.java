package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample9_getallselectedoptionfromMultiselectedListbox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Software%20Testing/selenium/html%20files/multipleoptionslistbox.html");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select S=new Select(country);
		S.selectByIndex(0);
		S.selectByIndex(1);
		//S.selectByIndex(2);
		S.selectByIndex(3);
		
		 List<WebElement> allselectedoptions = S.getAllSelectedOptions();
		 
		for( WebElement A:allselectedoptions)
		{
			System.out.println(A.getText());
		}
		
		
	}
}
