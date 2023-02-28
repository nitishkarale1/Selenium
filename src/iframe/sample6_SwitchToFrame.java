package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_SwitchToFrame
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch selenium focus to frame
		
//		driver.switchTo().frame("iframeResult"); //by String FrameId
//		driver.switchTo().frame("iframeResult"); //by FrameName
		driver.switchTo().frame(1);              //by FrameIndex
//		driver.findElement(By.xpath("//iframe[@id='iframeResult']")); //by Frame WebElement
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]")).click();
		
		String text=driver.findElement(By.xpath("//body[@contenteditable='false']//p")).getText();
		System.out.println("text on frame: "+text);
		
		//switch seleniun focus to main page from child frame
		
		//driver.switchTo().parentFrame(); //switch to parent frame
		driver.switchTo().defaultContent(); //switch to main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		String text1 = driver.findElement(By.xpath("//span[text()='Change Orientation']")).getText();
		System.out.println("text on main page: "+text1);
		
		
		
		Thread.sleep(1500);
		driver.close();
	}
	
}
