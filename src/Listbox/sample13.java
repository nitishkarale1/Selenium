package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sample13 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select S=new Select(month);
		S.selectByVisibleText("Oct");
		//S.selectByIndex(9);
		//S.selectByValue("10");
		List<WebElement> AllOpt = S.getOptions();
		for(WebElement s1:AllOpt)
		{
			System.out.println(s1.getText());
		}
		
	}
	
}
