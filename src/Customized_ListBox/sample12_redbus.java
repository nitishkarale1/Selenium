package Customized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample12_redbus
{
	public static void main(String[] args) throws InterruptedException 
	{
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[contains(text(),'Manage')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'My Ticket')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your ticket number']")).sendKeys("NMK123");
		driver.findElement(By.xpath("//span[@class='icon icon-down']")).click();
		driver.findElement(By.xpath("//input[@id='cntryInput']")).sendKeys("Argentina");
		driver.findElement(By.xpath("//div[text()='Argentina']")).click();
		driver.findElement(By.xpath("//input[@name='mobileno']")).sendKeys("12344568");
		driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
		
		Thread.sleep(2000);
		driver.close();
	
	}
	
}
