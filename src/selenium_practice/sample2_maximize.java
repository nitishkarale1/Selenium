package selenium_practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;






public class sample2_maximize
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.Chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
				
		Thread.sleep(3000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.google.com/");
//		
//		Thread.sleep(3000);
//		
//		driver.manage().window().maximize();
		
		
//	    Options	s1=driver.manage();
//	    Window s2=s1.window();
	}
}
