package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample8_getselectedoptionfromMultiselectedListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Software%20Testing/selenium/html%20files/multipleoptionslistbox.html");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='abc123']"));
		
		Select S=new Select(country);
		
		S.selectByIndex(3);
		Thread.sleep(200);
		S.selectByIndex(1);
		Thread.sleep(200);
		S.selectByIndex(0);
		Thread.sleep(200);
		S.selectByIndex(2);
		
		
		//String text=S.getFirstSelectedOption().getText();
		
		//System.out.println(text);
		
		WebElement selected_option=S.getFirstSelectedOption();
		
		String text=selected_option.getText();
		
		System.out.println(text);
		
	}
}
