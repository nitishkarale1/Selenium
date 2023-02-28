package Page_Object_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page_1 
{
	@FindBy (xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']")private WebElement LoginBtn;
	
	
	public KiteLogin1Page_1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUN()
	{
		UN.sendKeys("FE5680");
	}
	
	public void enterPWD()
	{
		PWD.sendKeys("nitishk@7620");
	}
	
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
	
	
}
