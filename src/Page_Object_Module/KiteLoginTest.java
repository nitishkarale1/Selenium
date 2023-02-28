package Page_Object_Module;

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
		
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickOnLoginBtn();
		
		KiteLogin2Page Login2=new KiteLogin2Page(driver);
		Login2.enterPin();
		Login2.ClickOnCntBtn();
		
		KiteHomePage Home=new KiteHomePage(driver);
		Home.VerifyUserID();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
