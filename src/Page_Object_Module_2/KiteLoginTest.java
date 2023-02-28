package Page_Object_Module_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		KiteLogin1Page Login1=new KiteLogin1Page(driver);
		Login1.inpKiteLogin1PageUserName();
		Login1.inpKiteLogin1PagePassword();
		Login1.ClickKiteLogin1PageLoginBtn();
		
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		login2.inpKiteLogin2PagePin();
		login2.CliclKiteLogin2PageCntBtn();
		
		KiteHomePage Home=new KiteHomePage(driver);
		Home.VerifyUserID();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
