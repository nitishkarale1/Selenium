package Listbox;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1_selectOptionfromSingleSelectableListbox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select S=new Select(day);
		
		S.selectByValue("18");
		//S.selectByIndex(17);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select S1=new Select(month);
		
		//S.selectByVisibleText("Aug");
		
		//S.selectByValue("10");
		
		S1.selectByIndex(9);
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select S2=new Select(year);
		S2.selectByValue("1994");
		//S2.selectByIndex(28);
		
		
		boolean result=S2.isMultiple();
		if (result==true)
		{
			System.out.println("Listbox is of multi-selectable");
		}
		else
		{
			System.out.println("Listbox is of single-selectable");
		}
		
		
	}
}
