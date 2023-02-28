package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page_2
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement CntBtn;
	
	
	public KiteLogin2Page_2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterPin()
	{
		Pin.sendKeys("181094");
	}
	
	public void ClickOnCntBtn()
	{
		CntBtn.click();
	}
	
	
}
