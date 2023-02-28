package Page_Object_Module;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		KiteLogin1page_2 login1=new KiteLogin1page_2(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.ClickOnLoginBtn();
		
		KiteLogin2Page_2 login2=new KiteLogin2Page_2(driver);
		login2.enterPin();
		login2.ClickOnCntBtn();
		
		KiteHomePage_2 Home=new KiteHomePage_2(driver);
		Home.verifyUserID();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
