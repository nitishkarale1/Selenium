package Sample1;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) 
	{
		//step1:set path of chromedriver.exe file
		//parameter1:name of the browser(small letter)
		//parameter2:path of the browser
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//step2: create object of chromedriver class
		ChromeDriver driver=new ChromeDriver();
			
	}
}
