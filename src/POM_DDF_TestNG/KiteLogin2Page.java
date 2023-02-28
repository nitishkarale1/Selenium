package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement cntBtn;
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin2pagePin(String pinInfo)
	{
		Pin.sendKeys(pinInfo);
	}
	
	public void clickKitelogin2PageCntBtn()
	{
		cntBtn.click();
	}
	
}
