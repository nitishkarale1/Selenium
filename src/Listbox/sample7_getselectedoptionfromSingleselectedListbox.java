package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample7_getselectedoptionfromSingleselectedListbox 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select S1=new Select(Year);
		
		S1.selectByValue("1994");
		
		WebElement selectedoption = S1.getFirstSelectedOption();
		
		String text=selectedoption.getText();
		System.out.println(text);
				
	}
}
