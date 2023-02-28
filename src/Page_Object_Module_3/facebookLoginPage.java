package Page_Object_Module_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLoginPage
{
	@FindBy (xpath="//input[@id='email']") private WebElement UN;
	@FindBy (xpath="//input[@id='pass']") private WebElement PW;
	@FindBy (xpath="//button[@name='login']") private WebElement LgnBtn;
	
	public facebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputLoginUserName()
	{
		UN.sendKeys("karalenitish979@gmail.com");
	}
	
	public void inputLoginPassword()
	{
		PW.sendKeys("nkhonor8pro");
	}
	
	public void clickLoginBtn()
	{
		LgnBtn.click();
	}
	
}
