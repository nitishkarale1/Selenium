package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample4_deselectOptionfrommultiselectableListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Software%20Testing/selenium/html%20files/multipleoptionslistbox.html");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select S=new Select(country);
		
		//Select multiple options from Listbox
		S.selectByIndex(0);
		S.selectByVisibleText("Sri");
		S.selectByVisibleText("Aus");
		
		Thread.sleep(2000);
		//deselect multiple options from Listbox
//		S.deselectByVisibleText("Ind");
//		S.deselectByIndex(1);
//		S.deselectByIndex(3);
		
		S.deselectAll();
		
		boolean result=S.isMultiple();
		if(result==true)
		{
			System.out.println("Listbox is multi-selectable");
		}
		else
		{
			System.out.println("Listbox is single-selectable");
		}
		
		
	}
}
