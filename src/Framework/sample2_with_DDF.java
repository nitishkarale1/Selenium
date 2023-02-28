package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_with_DDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("D:\\Software Testing\\selenium\\sampleSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Software Testing\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		//enter UN
		String UserName = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UserName);
		
		//enter password
		String Passwoord = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Passwoord);
		
		//click on login btn
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter pin
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		//click on continue btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//get actual UserID
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String ExpUserID = sh.getRow(0).getCell(3).getStringCellValue();
		
		//compare actual vs expected
		if(actUserID.equals(ExpUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}
