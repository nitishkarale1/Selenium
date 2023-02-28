package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_close 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://meet.google.com/");
	     driver.close();
	}
}
