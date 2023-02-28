package POM_With_DDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement CntBtn;
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin2PagePin(String PinInfo)
	{
		Pin.sendKeys(PinInfo);
	}
	
	public void ClickKiteLogin2PageCntBtn()
	{
		CntBtn.click();
	}
	
}
