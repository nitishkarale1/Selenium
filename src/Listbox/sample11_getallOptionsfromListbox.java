package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample11_getallOptionsfromListbox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select S2=new Select(month);
		
		List<WebElement> alloptions=S2.getOptions();
		
		for(WebElement S1:alloptions)
		{
			System.out.println(S1.getText());
		}
		
		System.out.println(alloptions.size());
	}
}
