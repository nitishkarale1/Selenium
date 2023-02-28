package Handling_Of_Dynamic_Elements;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6_getReviwFromFlipkartApp
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("nothing ear 1");

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")).click();
		
		Set<String> AllIds = driver.getWindowHandles();
		ArrayList<String> A=new ArrayList<String>(AllIds);
		String childwindowID = A.get(1);
		
		driver.switchTo().window(childwindowID);
		
		String review = driver.findElement(By.xpath("((//div[@class='_1YokD2 _2GoDe3'])[1]//span)[12]")).getText();
		
		System.out.println(review);
//		String review = driver.findElement(By.xpath("((//div[@class='_1YokD2 _2GoDe3'])[1]//span)[12]")).getText();
//		
//		System.out.println(review);
		
	}
	
}
