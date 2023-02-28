package Page_Object_Module_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookloginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		facebookLoginPage lgn=new facebookLoginPage(driver);
		lgn.inputLoginUserName();
		lgn.inputLoginPassword();
		lgn.clickLoginBtn();
		
		facebookHomePage home=new facebookHomePage(driver);
		home.verifyUserId();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
}
