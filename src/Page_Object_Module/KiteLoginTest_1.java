package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		KiteLogin1Page_1 Login1=new KiteLogin1Page_1(driver);
		Login1.enterUN();
		Login1.enterPWD();
		Login1.clickOnLoginBtn();
		
		KiteLogin2Page_1 login2=new KiteLogin2Page_1(driver);
		login2.enterPin();
		login2.ClickOnCntBtn();
		
		KiteHomePage1 Home=new KiteHomePage1(driver);
		Home.VerifyUserID();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
