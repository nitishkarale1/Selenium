package Page_Object_Module_5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		
		//instagram login page object created
		instaLoginpage Login=new instaLoginpage(driver);
		
		Login.inpInstaLoginPageUserName();
		Login.inpInstaLoginPagePassword();
		Login.clickLoginPageLoginBtn();
		
		//instagram home page object created
		instaHomePage Home=new instaHomePage(driver);
		
		Home.clickInstaHomePageProfile();
		Home.verifyInstaHomePageUserName();
		Home.clickInstaHomePageSearch();
		Home.inpInstaHomePageSearchBar();
		Home.verifyInstaHomePageCaption(driver);
		Home.clickInstaHomePageOne8Link();
		
		//one8 home page object created
		One8HomePage one8=new One8HomePage(driver);
		
		one8.switchFocusToChildWindow(driver);
		Thread.sleep(10000);
		one8.closeOne8HomePagePopUp();
		one8.verifyOne8HomePageShopNowBtn();
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
