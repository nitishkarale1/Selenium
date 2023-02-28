package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo
{
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications-");
	    System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\LENOVO\\eclipse-workspace\\facebookProfileVerification\\Browsers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("karalenitish979@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nkhonor8pro");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	
}
