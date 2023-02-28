package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample2_selectOptionfrommultiSelectableListbox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Software%20Testing/selenium/html%20files/sample5.select%20multiple%20options.html");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select S=new Select(country);
		
		S.selectByVisibleText("Ind");
		S.selectByVisibleText("Sri");
		S.selectByIndex(2);
		S.selectByIndex(3);
		
		

		
	}
}
