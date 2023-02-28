package Page_Object_Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement LogInBtn;
	
	
	public KiteLogin1Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin1PageUserName()
	{
		UN.sendKeys("FE5680");
	}
	
	public void inpKiteLogin1PagePassword()
	{
		PWD.sendKeys("nitishk@7620");
	}
	
	public void ClickKiteLogin1PageLogInBtn()
	{
		LogInBtn.click();
	}

}
