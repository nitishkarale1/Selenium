package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample9_navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		//Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title1=driver.getTitle();
		System.out.println(title1);
		String URL1=driver.getCurrentUrl();
		System.out.println(URL1);
		
		System.out.println("-----------------------------------------");
		
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		String title2=driver.getTitle();
		System.out.println(title2);
		String URL2=driver.getCurrentUrl();
		System.out.println(URL2);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
}
