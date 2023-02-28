package Facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class facebbok_login_through_ExcelSheetData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.edge.driver",
				"D:\\Software Testing\\selenium\\edge driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(option);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		
		Sheet SH = WorkbookFactory.create(file).getSheet("DDF");
		
		String username = SH.getRow(0).getCell(0).getStringCellValue();
		
		String password = SH.getRow(0).getCell(1).getStringCellValue();
		
		String Pin = SH.getRow(0).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);;
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(Pin);
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//span[@class='user-id']"))).click().perform();
		  driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		  
		  driver.close();
	}
	
	
}
