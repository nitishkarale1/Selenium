package Page_Object_Module_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faccebookLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		facebookLogin1Page login1=new facebookLogin1Page(driver);
		login1.enterUN();
		login1.enterPassword();
		login1.ClickLoginBtn();
		
		facebookHomePage home=new facebookHomePage(driver);
		home.verifyName();
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
}
