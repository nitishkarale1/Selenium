package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample7_xpath_By_contains_usinf_text 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://services.midcindia.org/services/UM_Pages/Login.aspx");
		
		driver.findElement(By.xpath("//input[contains(@name,'Main$User')]")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//input[contains(@onclick,'_DoPostBack')]")).click();
		
	}
}
