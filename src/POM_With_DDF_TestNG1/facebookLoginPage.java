package POM_With_DDF_TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookLoginPage 
{
	@FindBy(xpath="//input[@id='email']") private WebElement UN;
	@FindBy(xpath="//input[@id='pass']") private WebElement PWD;
	@FindBy(xpath="//button[@name='login']") private WebElement LoginBtn;
	
	public facebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpFacebookLoginPageUserName(String UserName)
	{
		UN.sendKeys(UserName);
	}
	
	public void inpFacebookLoginPagePasswaord(String Password)
	{
		PWD.sendKeys(Password);
	}
	
	public void clickFacebookLoginPageLoginBtn()
	{
		LoginBtn.click();
	}
}
